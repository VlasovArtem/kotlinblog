package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.Comment
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface CommentService : MainService<Comment> {

    fun getAll(): List<Comment>
    fun get(id: String): Optional<Comment>
    fun getUserComments(userId: String): List<Comment>

}