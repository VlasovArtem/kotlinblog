package org.avlasov.kotlinblog.entity

import org.springframework.data.mongodb.core.mapping.Document

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@Document(collection = "entries")
data class BlogEntry(val id: Long,
                     var title: String,
                     var description: String,
                     var category: String,
                     var image: ByteArray ) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is BlogEntry) return false

        if (id != other.id) return false
        if (title != other.title) return false
        if (description != other.description) return false
        if (category != other.category) return false
        if (!image.contentEquals(other.image)) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + title.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + category.hashCode()
        result = 31 * result + image.contentHashCode()
        return result
    }
}