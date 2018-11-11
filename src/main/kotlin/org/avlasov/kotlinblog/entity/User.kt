package org.avlasov.kotlinblog.entity

import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

/**
 *   Created By artemvlasov on 2018-11-09
 **/
@Document(collection = "users")
data class User(val userId: String?,
                val firstName: String,
                val lastName: String) : Base(userId) {

    @DBRef var posts: List<Post>
    @DBRef var comments: List<Comment>

    init {
        posts = Collections.emptyList()
        comments = Collections.emptyList()
    }

    constructor(id: String?, firstName: String, lastName: String, posts: List<Post>, comments: List<Comment>) : this(id, firstName, lastName) {
        this.posts = posts
        this.comments = comments
    }

}