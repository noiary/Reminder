package com.max.reminder.controller

import com.max.reminder.pojo.model.User
import com.max.reminder.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/user")
class UserController {
    @Autowired
    private lateinit var userService: UserService

    @PostMapping("/login")
    fun login(
        @RequestParam("username") username: String,
        @RequestParam("password") password: String
    ): User {
        return userService.login(username, password)
    }

    @PostMapping("/register")
    fun register(@RequestBody user: User) {
        userService.register(user)
    }
}