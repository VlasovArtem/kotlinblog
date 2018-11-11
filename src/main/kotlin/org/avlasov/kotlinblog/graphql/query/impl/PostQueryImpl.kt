package org.avlasov.kotlinblog.graphql.query.impl

import org.avlasov.kotlinblog.graphql.query.PostQuery
import org.avlasov.kotlinblog.service.PostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class PostQueryImpl(@Autowired val postService: PostService) : PostQuery {
    override fun findPosts() = postService.getAll()

    override fun findPost(id: String) = postService.get(id)

    override fun getUserPosts(userId: String) = postService.getPostsByAuthorId(userId)
}