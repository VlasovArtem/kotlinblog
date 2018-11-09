package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.BlogEntry
import org.avlasov.kotlinblog.repository.BlogRepository
import org.avlasov.kotlinblog.service.BlogService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class BlogServiceImpl(@Autowired private val blogRepository: BlogRepository) : BlogService {

    override fun getBlogEntriesByUserId(userId: String): List<BlogEntry> = blogRepository.findBlogEntriesByUserId(userId)

    override fun get(id: String): Optional<BlogEntry> = blogRepository.findById(id)

    override fun getAll(): List<BlogEntry> = blogRepository.findAll()

    override fun add(blogEntry: BlogEntry): BlogEntry = blogRepository.insert(blogEntry)

}