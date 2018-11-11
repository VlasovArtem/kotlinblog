package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.repository.PostRepository
import org.avlasov.kotlinblog.service.PostService
import org.springframework.stereotype.Service
import java.time.LocalDateTime
import java.util.*

@Service
class PostServiceImpl(postRepository: PostRepository)
    : MainServiceImpl<Post, PostRepository>(postRepository), PostService {

    override fun getPostsByAuthorId(authorId: String): List<Post> = repository.findPostsByAuthorId(authorId)

    override fun get(id: String): Optional<Post> = repository.findById(id)

    override fun getAll(): List<Post> = repository.findAll()

    override fun count(): Long = repository.count()

    override fun findPostsByCreatedDateBetween(start: LocalDateTime, end: LocalDateTime): List<Post> =
        repository.findPostsByCreatedDateBetween(start, end)

    override fun countPostByCreatedDateBetween(start: LocalDateTime, end: LocalDateTime): Long =
        repository.countPostByCreatedDateBetween(start, end)

}