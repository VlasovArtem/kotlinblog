package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.BlogControllerEntity
import org.avlasov.kotlinblog.entity.BlogEntry
import org.avlasov.kotlinblog.repository.BlogRepository
import org.avlasov.kotlinblog.service.BlogService
import org.bson.types.ObjectId
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class BlogServiceImpl(@Autowired private val blogRepository: BlogRepository) : BlogService {

    override fun get(id: String): Optional<BlogEntry> = blogRepository.findById(id)

    override fun getAll(): List<BlogEntry> = blogRepository.findAll()

    override fun add(blogControllerEntity: BlogControllerEntity) {
        blogRepository.insert(BlogEntry(ObjectId.get().toString(), blogControllerEntity.title, blogControllerEntity.description, blogControllerEntity.category, blogControllerEntity.image))
    }
}