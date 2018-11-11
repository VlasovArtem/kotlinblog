package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.User
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface UserService : MainService<User> {

    fun get(id: String): Optional<User>

}