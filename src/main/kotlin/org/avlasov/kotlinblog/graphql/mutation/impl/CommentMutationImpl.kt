package org.avlasov.kotlinblog.graphql.mutation.impl

import org.avlasov.kotlinblog.entity.Comment
import org.avlasov.kotlinblog.graphql.input.CommentInput
import org.avlasov.kotlinblog.graphql.input.PostInput
import org.avlasov.kotlinblog.graphql.input.UserInput
import org.avlasov.kotlinblog.graphql.mapping.InputEntityMapping
import org.avlasov.kotlinblog.graphql.mutation.CommentMutation
import org.avlasov.kotlinblog.service.CommentService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class CommentMutationImpl(@Autowired val commentService: CommentService) : CommentMutation {

    private val inputEntityMapping: InputEntityMapping = InputEntityMapping()

    override fun addComment(comment: String, author: UserInput, post: PostInput): Comment = commentService.addEntity(Comment(null, comment, author = inputEntityMapping.userInputToUser(author), post = inputEntityMapping.postInputToPost(post)))
    override fun addComment(commentInput: CommentInput): Comment = commentService.addEntity(inputEntityMapping.commentInputToComment(commentInput))
}