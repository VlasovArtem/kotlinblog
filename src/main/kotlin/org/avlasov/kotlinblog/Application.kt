package org.avlasov.kotlinblog

import org.avlasov.kotlinblog.config.ApplicationConfig
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    SpringApplicationBuilder(ApplicationConfig::class.java).profiles("development", "rest").run(*args)
}