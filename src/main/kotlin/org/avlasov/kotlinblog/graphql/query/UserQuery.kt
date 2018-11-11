package org.avlasov.kotlinblog.graphql.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.avlasov.kotlinblog.entity.User
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface UserQuery : GraphQLQueryResolver {

    fun findUser(id: String): Optional<User>

}