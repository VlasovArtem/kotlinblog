package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.Post
import org.springframework.data.mongodb.repository.MongoRepository
import java.time.LocalDateTime

/**
 *   Created By artemvlasov on 2018-10-25
 **/
interface PostRepository : MongoRepository<Post, String> {

    fun findPostsByAuthorId(id: String): List<Post>
    fun findPostsByCreatedDateBetween(start: LocalDateTime, end: LocalDateTime): List<Post>
    fun countPostByCreatedDateBetween(start: LocalDateTime, end: LocalDateTime): Long

}