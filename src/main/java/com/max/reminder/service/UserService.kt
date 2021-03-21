package com.max.reminder.service

import com.max.reminder.pojo.model.User

interface UserService {
    /**
     * Login by username and password
     */
    fun login(username: String, password: String): User

    /**
     * Register
     */
    fun register(user: User)
}