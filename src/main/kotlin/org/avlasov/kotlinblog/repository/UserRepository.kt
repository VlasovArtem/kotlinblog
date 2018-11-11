package org.avlasov.kotlinblog.repository

import org.avlasov.kotlinblog.entity.User
import org.springframework.data.mongodb.repository.MongoRepository

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface UserRepository : MongoRepository<User, String>