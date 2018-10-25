package org.avlasov.kotlinblog.config.database

import com.mongodb.MongoClient
import de.flapdoodle.embed.mongo.Command
import de.flapdoodle.embed.mongo.MongodProcess
import de.flapdoodle.embed.mongo.MongodStarter
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder
import de.flapdoodle.embed.mongo.config.Net
import de.flapdoodle.embed.mongo.config.RuntimeConfigBuilder
import de.flapdoodle.embed.mongo.distribution.IFeatureAwareVersion
import de.flapdoodle.embed.mongo.distribution.Version
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.DependsOn
import org.springframework.context.annotation.Profile
import org.springframework.data.mongodb.core.MongoTemplate

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Profile("embedded")
class EmbeddedMongoDBConfiguration : AbstractMongoDBConfiguration() {

    private val bindIp = "127.0.0.1"
    private val testPort = 27028
    private val version: IFeatureAwareVersion = Version.V3_6_5

    @Bean(destroyMethod = "stop")
    fun mongodProcess(): MongodProcess {
        val net = Net(bindIp, testPort, false)
        val runtimeConfigBuilder = RuntimeConfigBuilder()
        val build = runtimeConfigBuilder.defaults(Command.MongoD).build()
        val starter = MongodStarter.getInstance(build)
        val mongodConfig = MongodConfigBuilder()
            .version(version)
            .net(net)
            .build()
        val mongodExecutable = starter.prepare(mongodConfig)
        return mongodExecutable.start()
    }

    @Bean
    @DependsOn("mongodProcess")
    fun mongoTemplate(mongoClient: MongoClient): MongoTemplate {
        return MongoTemplate(mongoClient, dbName)
    }

    @Bean(destroyMethod = "close")
    @DependsOn("mongodProcess")
    override fun mongoClient(): MongoClient {
        val mongoClient = MongoClient(bindIp, testPort)
        mongoClient.getDatabase(dbName)
        return mongoClient
    }

}