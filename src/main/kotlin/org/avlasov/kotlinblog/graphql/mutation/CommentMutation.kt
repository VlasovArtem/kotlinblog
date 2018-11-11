package org.avlasov.kotlinblog.graphql.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import org.avlasov.kotlinblog.entity.Comment
import org.avlasov.kotlinblog.graphql.input.CommentInput
import org.avlasov.kotlinblog.graphql.input.PostInput
import org.avlasov.kotlinblog.graphql.input.UserInput

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface CommentMutation : GraphQLMutationResolver {

    fun addComment(comment: String, author: UserInput, post: PostInput): Comment
    fun addComment(commentInput: CommentInput): Comment

}