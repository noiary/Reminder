package com.max.reminder.controller

import com.max.reminder.service.SignService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/sign")
class SignController {
    @Autowired
    private lateinit var signService: SignService

    @PostMapping("/sign")
    fun weightSign(@RequestBody weight: Float) {
        signService.signWeight(weight)
    }
}