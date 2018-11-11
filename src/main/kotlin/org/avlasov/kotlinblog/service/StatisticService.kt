package org.avlasov.kotlinblog.service

import java.time.LocalDateTime

/**
 *   Created By artemvlasov on 2018-11-09
 **/
interface StatisticService {

    fun totalPosts(): Long
    fun totalPostsBetweenDates(start: LocalDateTime, end: LocalDateTime): Long

}