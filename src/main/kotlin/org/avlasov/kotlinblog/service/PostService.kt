package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.Post
import java.util.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
interface PostService {

    fun getAll(): List<Post>
    fun get(id: String): Optional<Post>
    fun add(post: Post): Post
    fun getPostsByAuthorId(userId: String): List<Post>

}