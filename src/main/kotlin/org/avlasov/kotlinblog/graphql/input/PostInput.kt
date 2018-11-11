package org.avlasov.kotlinblog.graphql.input

/**
 *   Created By artemvlasov on 2018-11-10
 **/
class PostInput(var id: String?,
                val title: String,
                val description: String?,
                val category: String?,
                val author: UserInput)