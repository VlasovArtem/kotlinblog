package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.Post
import java.time.LocalDateTime
import java.util.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
interface PostService : MainService<Post> {

    fun getAll(): List<Post>
    fun get(id: String): Optional<Post>
    fun getPostsByAuthorId(authorId: String): List<Post>
    fun count(): Long
    fun findPostsByCreatedDateBetween(start: LocalDateTime, end: LocalDateTime): List<Post>
    fun countPostByCreatedDateBetween(start: LocalDateTime, end: LocalDateTime): Long

}