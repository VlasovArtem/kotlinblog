package org.avlasov.kotlinblog.graphql.mutation.impl

import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.graphql.input.PostInput
import org.avlasov.kotlinblog.graphql.input.UserInput
import org.avlasov.kotlinblog.graphql.mapping.InputEntityMapping
import org.avlasov.kotlinblog.graphql.mutation.PostMutation
import org.avlasov.kotlinblog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PostMutationImpl(@Autowired val postService: PostService) : PostMutation {

    private val inputEntityMapping = InputEntityMapping()

    override fun addPost(title: String, description: String?, category: String?, author: UserInput) = postService.addEntity(Post(null, title, description, category, inputEntityMapping.userInputToUser(author)))

    override fun addPost(postInput: PostInput): Post = postService.addEntity(inputEntityMapping.postInputToPost(postInput))

}