package org.avlasov.kotlinblog.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.avlasov.kotlinblog.entity.Post
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface PostQuery : GraphQLQueryResolver {

    fun findPosts(): List<Post>
    fun findPost(id: String): Optional<Post>
    fun getUserPosts(userId: String): List<Post>

}