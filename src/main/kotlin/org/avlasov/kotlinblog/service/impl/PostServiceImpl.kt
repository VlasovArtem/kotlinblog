package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.repository.PostRepository
import org.avlasov.kotlinblog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class PostServiceImpl(@Autowired private val postRepository: PostRepository) : PostService {

    override fun getPostsByUserId(userId: String): List<Post> = postRepository.findPostsByUserId(userId)

    override fun get(id: String): Optional<Post> = postRepository.findById(id)

    override fun getAll(): List<Post> = postRepository.findAll()

    override fun add(blogEntry: Post): Post = postRepository.insert(blogEntry)

}