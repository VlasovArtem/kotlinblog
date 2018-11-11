package org.avlasov.kotlinblog.entity

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime
import java.util.*

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@Document(collection = "posts")
data class Post(val postId: String?,
                val title: String,
                val description: String?,
                val category: String?,
                @DBRef val author: User) : Base(postId) {

    @DBRef var comments: List<Comment>
    var createdDate: LocalDateTime
    var modifiedDate: LocalDateTime

    constructor(id: String?, title: String, description: String?, category: String?, author: User, comments: List<Comment>, createdDate: LocalDateTime, modifiedDate: LocalDateTime)
            : this(id, title, description, category, author) {
        this.createdDate = createdDate
        this.modifiedDate = modifiedDate
        this.comments = comments
    }

    init {
        createdDate = LocalDateTime.now()
        modifiedDate = LocalDateTime.now()
        comments = Collections.emptyList()
    }


}