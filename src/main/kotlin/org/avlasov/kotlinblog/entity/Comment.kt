package org.avlasov.kotlinblog.entity

import org.springframework.data.annotation.Id

/**
 *   Created By artemvlasov on 2018-11-09
 **/
data class Comment(@Id val id: String,
                   val comment: String,
                   val user: User)