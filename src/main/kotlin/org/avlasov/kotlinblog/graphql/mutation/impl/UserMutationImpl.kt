package org.avlasov.kotlinblog.graphql.mutation.impl

import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.graphql.input.UserInput
import org.avlasov.kotlinblog.graphql.mapping.InputEntityMapping
import org.avlasov.kotlinblog.graphql.mutation.UserMutation
import org.avlasov.kotlinblog.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class UserMutationImpl(@Autowired val userService: UserService) : UserMutation {

    private val inputEntityMapping: InputEntityMapping = InputEntityMapping()

    override fun addUser(firstName: String, lastName: String): User = userService.addEntity(User(null, firstName, lastName))
    override fun addUser(userInput: UserInput): User = userService.addEntity(inputEntityMapping.userInputToUser(userInput))
}