package org.avlasov.kotlinblog.service.impl

import org.avlasov.kotlinblog.entity.Base
import org.avlasov.kotlinblog.exception.EntityIsExistsException
import org.avlasov.kotlinblog.service.MainService
import org.springframework.data.mongodb.repository.MongoRepository

abstract class MainServiceImpl<T : Base, F : MongoRepository<T, String>>(protected val repository: F) : MainService<T> {
    override fun addEntity(t: T): T {
        if (t.id.isNullOrBlank())
            t.id = null
        else {
            t.id?.also {
                if (repository.existsById(it))
                    throw EntityIsExistsException("Comment with this tracking number is exists.")
            }
        }
        return repository.insert(t)
    }
}