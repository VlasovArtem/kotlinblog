package org.avlasov.kotlinblog.graphql.query.impl

import org.avlasov.kotlinblog.entity.Comment
import org.avlasov.kotlinblog.graphql.query.CommentQuery
import org.avlasov.kotlinblog.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import java.util.*

@Component
class CommentQueryImpl(@Autowired val commentService: CommentService) : CommentQuery {

    override fun findComment(id: String): Optional<Comment> = commentService.get(id)

    override fun findComments(): List<Comment> = commentService.getAll()

    override fun findUserComments(id: String): List<Comment> = commentService.getUserComments(id)
}