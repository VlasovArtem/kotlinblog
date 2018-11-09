package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.BlogEntry
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Repository
interface BlogRepository : MongoRepository<BlogEntry, String> {

    fun findBlogEntriesByUserId(id: String): List<BlogEntry>

}