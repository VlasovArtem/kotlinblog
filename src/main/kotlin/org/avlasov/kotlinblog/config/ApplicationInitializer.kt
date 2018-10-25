package org.avlasov.kotlinblog.config

import org.springframework.web.filter.CharacterEncodingFilter
import org.springframework.web.filter.HttpPutFormContentFilter
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer
import javax.servlet.Filter

/**
 *   Created By artemvlasov on 2018-10-25
 **/
class ApplicationInitializer : AbstractAnnotationConfigDispatcherServletInitializer() {

    override fun getRootConfigClasses(): Array<Class<*>>? {
        return arrayOf(ApplicationConfig::class.java)
    }

    override fun getServletConfigClasses(): Array<Class<*>>? {
        return arrayOf(ServletContextConfig::class.java)
    }

    override fun getServletMappings(): Array<String> {
        return arrayOf("/*")
    }

    override fun getServletFilters(): Array<Filter>? {
        val characterEncodingFilter = CharacterEncodingFilter()
        characterEncodingFilter.encoding = "UTF-8"
        return arrayOf(characterEncodingFilter, HttpPutFormContentFilter())
    }

}