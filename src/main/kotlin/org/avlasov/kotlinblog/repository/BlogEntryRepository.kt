package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.BlogEntry
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Repository
interface BlogEntryRepository : MongoRepository<BlogEntry, ObjectId>