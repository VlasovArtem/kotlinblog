package org.avlasov.kotlinblog.graphql.query.impl

import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.graphql.query.UserQuery
import org.avlasov.kotlinblog.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserQueryImpl(@Autowired val userService: UserService) : UserQuery {
    override fun findUser(id: String) = userService.get(id)
}