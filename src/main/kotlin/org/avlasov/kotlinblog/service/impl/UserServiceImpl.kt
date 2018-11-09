package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.repository.UserRepository
import org.avlasov.kotlinblog.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import java.util.*

class UserServiceImpl(@Autowired val userRepository: UserRepository) : UserService {
    override fun get(id: String): Optional<User> = userRepository.findById(id)
}