package org.avlasov.kotlinblog.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

/**
 *   Created By artemvlasov on 2018-10-26
 **/
@Controller
class UIController {

    @GetMapping(path = [ "/" ])
    fun index(): String = "index"

}