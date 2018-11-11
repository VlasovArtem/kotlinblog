package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.repository.UserRepository
import org.avlasov.kotlinblog.service.UserService
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(userRepository: UserRepository) : MainServiceImpl<User, UserRepository>(userRepository), UserService {
    override fun get(id: String): Optional<User> = repository.findById(id)
}