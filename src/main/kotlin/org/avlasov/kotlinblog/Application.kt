package org.avlasov.kotlinblog

import org.avlasov.kotlinblog.config.ApplicationConfig
import org.avlasov.kotlinblog.entity.BlogEntry
import org.avlasov.kotlinblog.repository.BlogEntryRepository
import org.bson.types.ObjectId
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    val run = SpringApplicationBuilder(ApplicationConfig::class.java).profiles("development").run(*args)
    val blogEntryRepository = run.getBean(BlogEntryRepository::class.java)
    val objectId = ObjectId.get()
    blogEntryRepository.insert(BlogEntry(objectId, "test title", "test description", "category", "test".toByteArray()))
    println(blogEntryRepository.findById(objectId))
    run.close()
}