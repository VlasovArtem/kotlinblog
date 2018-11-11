package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.Comment
import org.springframework.data.mongodb.repository.MongoRepository

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface CommentRepository : MongoRepository<Comment, String> {

    fun findCommentsByAuthorId(authorId: String): List<Comment>
    fun findCommentsByPostId(postId: String): List<Comment>

}