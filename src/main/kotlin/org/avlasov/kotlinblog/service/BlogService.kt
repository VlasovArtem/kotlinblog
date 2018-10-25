package org.avlasov.kotlinblog.service

import org.avlasov.kotlinblog.entity.BlogControllerEntity
import org.avlasov.kotlinblog.entity.BlogEntry
import org.springframework.stereotype.Service
import java.util.*

/**
 *   Created By artemvlasov on 2018-10-25
 **/
@Service
interface BlogService {

    fun add(blogControllerEntity: BlogControllerEntity)
    fun getAll(): List<BlogEntry>
    fun get(id: String): Optional<BlogEntry>

}