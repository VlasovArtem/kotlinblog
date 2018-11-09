package org.avlasov.kotlinblog.controller

import org.avlasov.kotlinblog.entity.BlogEntry
import org.avlasov.kotlinblog.service.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Profile
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@RestController
@RequestMapping(path = ["/api/blog"], produces = [APPLICATION_JSON_VALUE], consumes = [APPLICATION_JSON_VALUE])
@Profile("rest")
class BlogController(@Autowired private val blogService: BlogService) {

    @PostMapping(path = ["/add"])
    fun add(blogEntry: BlogEntry): ResponseEntity<String> {
        blogService.add(blogEntry)
        return ResponseEntity.ok("Blog entry successfully added")
    }

    @GetMapping(path = ["/get/all"])
    fun getAll(): ResponseEntity<List<BlogEntry>> = ResponseEntity.ok(blogService.getAll())

    @GetMapping(path = ["/get"])
    fun get(@RequestParam id: String): ResponseEntity<*> =
        blogService.get(id)
            .map { ResponseEntity.ok(it) }
            .orElseGet { ResponseEntity.notFound().build() }

    @GetMapping(path = ["/get/user/"])
    fun getUsersBlogEntries(@RequestParam userId: String) = blogService.getBlogEntriesByUserId(userId)

}