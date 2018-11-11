package org.avlasov.kotlinblog.service

/**
 *   Created By artemvlasov on 2018-11-10
 **/
interface MainService<T> {

    fun addEntity(t: T): T

}