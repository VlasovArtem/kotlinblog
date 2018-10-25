package org.avlasov.kotlinblog.config.database

import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Configuration
@EnableMongoRepositories("org.avlasov.kotlinblog.repository")
abstract class AbstractMongoDBConfiguration : AbstractMongoConfiguration() {

    protected val dbName = "kotlinblog"

    override fun getDatabaseName(): String {
        return dbName
    }

}