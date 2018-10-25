package org.avlasov.kotlinblog.config.database

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Profile
import org.springframework.data.mongodb.core.MongoTemplate

@Profile("development")
class MongoDBConfiguration : AbstractMongoDBConfiguration() {

    override fun mongoTemplate(): MongoTemplate {
        return MongoTemplate(mongoClient(), dbName)
    }

    @Bean
    override fun mongoClient(): MongoClient {
        return MongoClient(MongoClientURI("mongodb://localhost"))
    }

}