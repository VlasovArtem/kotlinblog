package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

/**
 *   Created By artemvlasov on 2018-11-09
 **/
@Repository
interface UserRepository : MongoRepository<User, String>