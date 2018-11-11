package org.avlasov.kotlinblog.graphql.input

/**
 *   Created By artemvlasov on 2018-11-10
 **/
class CommentInput(val id: String?,
                   val comment: String,
                   val author: UserInput,
                   val post: PostInput)