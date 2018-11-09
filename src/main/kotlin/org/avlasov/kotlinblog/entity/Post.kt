package org.avlasov.kotlinblog.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@Document(collection = "posts")
data class Post(@Id val id: String,
                val title: String,
                val description: String,
                val category: String,
                val user: User,
                val comments: List<Comment>,
                val image: ByteArray) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Post) return false

        if (id != other.id) return false
        if (title != other.title) return false
        if (description != other.description) return false
        if (category != other.category) return false
        if (user != other.user) return false
        if (comments != other.comments) return false
        if (!image.contentEquals(other.image)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + category.hashCode()
        result = 31 * result + user.hashCode()
        result = 31 * result + comments.hashCode()
        result = 31 * result + image.contentHashCode()
        return result
    }
}