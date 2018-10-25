package org.avlasov.kotlinblog.config

import org.avlasov.kotlinblog.config.database.EmbeddedMongoDBConfiguration
import org.avlasov.kotlinblog.config.database.MongoDBConfiguration
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@Configuration
@ComponentScan(basePackages = ["org.avlasov.kotlinblog"])
@ImportAutoConfiguration(classes = [MongoDBConfiguration::class, EmbeddedMongoDBConfiguration::class])
class ApplicationConfig