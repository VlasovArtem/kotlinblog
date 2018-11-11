package org.avlasov.kotlinblog.entity

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

/**
 *   Created By artemvlasov on 2018-11-09
 **/
@Document(collection = "comments")
data class Comment(val commentId: String?,
                   val comment: String,
                   @DBRef val author: User,
                   @DBRef val post: Post) : Base(commentId)