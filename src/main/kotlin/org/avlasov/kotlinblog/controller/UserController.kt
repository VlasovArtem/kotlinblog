package org.avlasov.kotlinblog.controller

import org.avlasov.kotlinblog.entity.User
import org.avlasov.kotlinblog.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 *   Created By artemvlasov on 2018-11-09
 **/
@RestController
@RequestMapping(path = ["/rest/api/user"], consumes = [MediaType.APPLICATION_JSON_VALUE])
class UserController(@Autowired private val userService: UserService) {


    @GetMapping(path = ["/get"])
    fun get(@RequestParam id: String): ResponseEntity<User> {
        val user = userService.get(id)
        if (user.isPresent) {
            return ResponseEntity.ok(user.get())
        }
        return ResponseEntity.notFound().build()
    }

}