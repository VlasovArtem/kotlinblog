package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.repository.PostRepository
import org.avlasov.kotlinblog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

class PostServiceImpl(@Autowired private val blogRepository: PostRepository) : PostService {

    override fun getBlogEntriesByUserId(userId: String): List<Post> = blogRepository.findBlogEntriesByUserId(userId)

    override fun get(id: String): Optional<Post> = blogRepository.findById(id)

    override fun getAll(): List<Post> = blogRepository.findAll()

    override fun add(blogEntry: Post): Post = blogRepository.insert(blogEntry)

}