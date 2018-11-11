package org.avlasov.kotlinblog.service.impl

import io.leangen.graphql.annotations.GraphQLArgument
import io.leangen.graphql.annotations.GraphQLQuery
import org.avlasov.kotlinblog.service.PostService
import org.avlasov.kotlinblog.service.StatisticService
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class StatisticServiceImpl(private val postService: PostService) : StatisticService {

    @GraphQLQuery
    override fun totalPosts(): Long = postService.count()

    @GraphQLQuery
    override fun totalPostsBetweenDates(@GraphQLArgument(name = "start") start: LocalDateTime, @GraphQLArgument(name = "end") end: LocalDateTime): Long = postService.countPostByCreatedDateBetween(start, end)

}