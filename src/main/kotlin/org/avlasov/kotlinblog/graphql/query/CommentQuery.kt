package org.avlasov.kotlinblog.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.avlasov.kotlinblog.entity.Comment
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface CommentQuery : GraphQLQueryResolver {

    fun findComments(): List<Comment>
    fun findComment(id: String): Optional<Comment>
    fun findUserComments(id: String): List<Comment>

}