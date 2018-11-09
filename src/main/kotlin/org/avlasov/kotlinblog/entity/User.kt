package org.avlasov.kotlinblog.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

/**
 *   Created By artemvlasov on 2018-11-09
 **/
@Document(collection = "users")
data class User(@Id val id: String,
                val firstName: String,
                val lastName: String)