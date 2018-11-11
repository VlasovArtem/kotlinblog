package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.Comment
import org.avlasov.kotlinblog.repository.CommentRepository
import org.avlasov.kotlinblog.service.CommentService
import org.springframework.stereotype.Service
import java.util.*

@Service
class CommentServiceImpl(commentRepository: CommentRepository) :
    MainServiceImpl<Comment, CommentRepository>(commentRepository), CommentService {
    override fun getUserComments(userId: String): List<Comment> = repository.findCommentsByAuthorId(userId)

    override fun getAll(): List<Comment> = repository.findAll()

    override fun get(id: String): Optional<Comment> = repository.findById(id)
}