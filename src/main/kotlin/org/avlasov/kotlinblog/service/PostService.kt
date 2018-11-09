package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.Post
import org.springframework.stereotype.Service
import java.util.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Service
interface PostService {

    fun getAll(): List<Post>
    fun get(id: String): Optional<Post>
    fun add(blogEntry: Post): Post
    fun getBlogEntriesByUserId(userId: String): List<Post>

}