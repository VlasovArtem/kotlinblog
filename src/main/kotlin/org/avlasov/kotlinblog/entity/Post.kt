package org.avlasov.kotlinblog.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 *   Created By artemvlasov on 2018-10-24
 **/
@Document(collection = "posts")
data class Post(@Id val id: String,
                val title: String,
                val description: String?,
                val category: String?,
                val author: User,
                val comments: List<Comment>)