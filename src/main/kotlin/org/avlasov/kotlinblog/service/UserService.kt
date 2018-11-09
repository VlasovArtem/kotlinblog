package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.User
import org.springframework.stereotype.Service
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
@Service
interface UserService {

    fun get(id: String): Optional<User>

}