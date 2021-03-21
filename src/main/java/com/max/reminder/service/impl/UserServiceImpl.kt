package com.max.reminder.service.impl

import com.max.reminder.dao.UserRepository
import com.max.reminder.exception.ExceptionEnum
import com.max.reminder.pojo.model.User
import com.max.reminder.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {
    @Autowired
    private lateinit var userRepository: UserRepository;

    override fun login(username: String, password: String): User {
        val result = userRepository.findAll().find { username == it.username && password == it.username }
        if (result != null) {
            return result
        } else {
            throw ExceptionEnum.LOGIN_USERNAME_OR_PASSWORD_INVALID.exception()
        }
    }

    override fun register(user: User) {
        userRepository.save(user)
    }
}