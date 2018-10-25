package org.avlasov.kotlinblog.config.database

import com.mongodb.MongoClient
import com.mongodb.MongoClientURI
import org.springframework.context.annotation.Profile

@Profile("development")
class MongoDBConfiguration : AbstractMongoDBConfiguration() {

    override fun mongoClient(): MongoClient {
        return MongoClient(MongoClientURI("mongodb://localhost"))
    }

}