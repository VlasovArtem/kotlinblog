package org.avlasov.kotlinblog.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.graphql.input.UserInput

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface UserMutation : GraphQLMutationResolver {

    fun addUser(firstName: String, lastName: String): User
    fun addUser(userInput: UserInput): User

}