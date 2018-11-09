package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.Post
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Repository
interface PostRepository : MongoRepository<Post, String> {

    fun findPostsByAuthorId(id: String): List<Post>

}