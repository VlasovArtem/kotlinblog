package org.avlasov.kotlinblog.graphql.mapping

import org.avlasov.kotlinblog.entity.Comment
import org.avlasov.kotlinblog.entity.Post
import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.graphql.input.CommentInput
import org.avlasov.kotlinblog.graphql.input.PostInput
import org.avlasov.kotlinblog.graphql.input.UserInput

/**
 *   Created By artemvlasov on 2018-11-10
 **/
class InputEntityMapping {

    fun postInputToPost(postInput: PostInput): Post = Post(postInput.id, postInput.title, postInput.description, postInput.category, userInputToUser(postInput.author))
    fun userInputToUser(userInput: UserInput): User = User(userInput.id, userInput.firstName, userInput.lastName)
    fun commentInputToComment(commentInput: CommentInput): Comment = Comment(commentInput.id, commentInput.comment, userInputToUser(commentInput.author), postInputToPost(commentInput.post))



}