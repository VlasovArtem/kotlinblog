package org.avlasov.kotlinblog.controller

import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.service.PostService
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@RestController
@RequestMapping(path = ["/rest/api/post"], produces = [APPLICATION_JSON_VALUE], consumes = [APPLICATION_JSON_VALUE])
class PostController(private val postService: PostService) {

    @PostMapping(path = ["/add"])
    fun add(post: Post): ResponseEntity<String> {
        postService.addEntity(post)
        return ResponseEntity.ok("Blog entry successfully added")
    }

    @GetMapping(path = ["/get/all"])
    fun getAll(): ResponseEntity<List<Post>> = ResponseEntity.ok(postService.getAll())

    @GetMapping(path = ["/get"])
    fun get(@RequestParam id: String): ResponseEntity<*> =
        postService.get(id)
            .map { ResponseEntity.ok(it) }
            .orElseGet { ResponseEntity.notFound().build() }

    @GetMapping(path = ["/get/user/"])
    fun getAuthorPosts(@RequestParam authorId: String) = postService.getPostsByAuthorId(authorId)

}