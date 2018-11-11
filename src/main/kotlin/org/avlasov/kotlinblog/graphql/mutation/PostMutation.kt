package org.avlasov.kotlinblog.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.graphql.input.PostInput
import org.avlasov.kotlinblog.graphql.input.UserInput

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface PostMutation : GraphQLMutationResolver {

    fun addPost (title: String, description: String?, category: String?, author: UserInput): Post
    fun addPost (postInput: PostInput): Post

}
