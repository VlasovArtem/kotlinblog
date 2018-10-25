package org.avlasov.kotlinblog.config

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import org.springframework.web.servlet.view.InternalResourceViewResolver



/**
 *   Created By artemvlasov on 2018-10-25
 **/
@EnableWebMvc
@Configuration
@ComponentScan("org.avlasov.kotlinblog.controller")
class ServletContextConfig : WebMvcConfigurer {

    override fun configureMessageConverters(converters: MutableList<HttpMessageConverter<*>>) {
        val mapper = Jackson2ObjectMapperBuilder
            .json()
            .defaultViewInclusion(true)
            .autoDetectFields(true)
            .build<ObjectMapper>()
        converters.add(MappingJackson2HttpMessageConverter(mapper))
    }

    override fun addResourceHandlers(registry: ResourceHandlerRegistry) {
        registry
            .addResourceHandler("/**")
            .addResourceLocations("/")
    }

    @Bean
    fun getInternalResourceViewResolver(): InternalResourceViewResolver {
        val resolver = InternalResourceViewResolver()
        resolver.setPrefix("/")
        resolver.setSuffix(".html")
        return resolver
    }

}