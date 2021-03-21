package com.max.reminder.dao

import com.max.reminder.pojo.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.Repository

interface UserRepository : CrudRepository<User, Int>{
}