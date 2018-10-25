package org.avlasov.kotlinblog.controller

import org.avlasov.kotlinblog.entity.BlogEntry
import org.avlasov.kotlinblog.service.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@RestController
@RequestMapping("/blog")
class BlogController(@Autowired private val blogService: BlogService) {

    @RequestMapping(path = ["/add"], method = [RequestMethod.POST], consumes = [APPLICATION_JSON_VALUE])
    fun add(blogControllerEntity: BlogControllerEntity): ResponseEntity<String> {
        blogService.add(blogControllerEntity)
        return ResponseEntity.ok("Blog entry successfully added")
    }

    @RequestMapping(path = ["/get/all"], method = [RequestMethod.GET], produces = [APPLICATION_JSON_VALUE])
    fun getAll(): ResponseEntity<List<BlogEntry>> = ResponseEntity.ok(blogService.getAll())

    @RequestMapping(path = ["/get"], method = [RequestMethod.GET], produces = [APPLICATION_JSON_VALUE])
    fun get(@RequestParam id: String): ResponseEntity<*> =
        blogService.get(id)
            .map { ResponseEntity.ok(it) }
            .orElseGet { ResponseEntity.notFound().build() }

    data class BlogControllerEntity(val title: String,
                                    val description: String,
                                    val category: String,
                                    val image: ByteArray)

}