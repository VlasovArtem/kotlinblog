package org.avlasov.kotlinblog.controller

import graphql.ExecutionInput
import graphql.GraphQL
import io.leangen.graphql.GraphQLSchemaGenerator
import io.leangen.graphql.metadata.strategy.query.AnnotatedResolverBuilder
import io.leangen.graphql.metadata.strategy.value.jackson.JacksonValueMapperFactory
import org.avlasov.kotlinblog.service.StatisticService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest


/**
 *   Created By artemvlasov on 2018-11-09
 **/
@RestController
class GraphQLController(statisticService: StatisticService) {

    private val graphQL: GraphQL

    init {
        val schema = GraphQLSchemaGenerator()
            .withResolverBuilders(AnnotatedResolverBuilder())
            .withOperationsFromSingleton(statisticService, StatisticService::class.java)
            .withValueMapperFactory(JacksonValueMapperFactory())
            .generate()
        graphQL = GraphQL.newGraphQL(schema).build()
    }

    @PostMapping(
        value = ["/graphql2"],
        consumes = [MediaType.APPLICATION_JSON_UTF8_VALUE],
        produces = [MediaType.APPLICATION_JSON_UTF8_VALUE]
    )
    @ResponseBody
    fun graphql(@RequestBody request: Map<String, String>, raw: HttpServletRequest): Map<String, Any> {
        val executionResult = graphQL.execute(
            ExecutionInput.newExecutionInput()
                .query(request["query"])
                .operationName(request["operationName"])
                .context(raw)
                .build()
        )
        return executionResult.toSpecification()
    }

}