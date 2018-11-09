package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.repository.PostRepository
import org.avlasov.kotlinblog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class PostServiceImpl(@Autowired private val postRepository: PostRepository) : PostService {

    override fun getPostsByAuthorId(authorId: String): List<Post> = postRepository.findPostsByAuthorId(authorId)

    override fun get(id: String): Optional<Post> = postRepository.findById(id)

    override fun getAll(): List<Post> = postRepository.findAll()

    override fun add(post: Post): Post = postRepository.insert(post)

}