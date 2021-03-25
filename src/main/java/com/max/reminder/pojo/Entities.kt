package com.max.reminder.pojo

import com.max.reminder.common.Enums
import io.swagger.annotations.ApiParam
import java.util.*
import javax.persistence.*

class Entities {
    @Entity
    @Table(name = "t_sign")
    class Sign(
        @Column(name = "user_id") var userId: Int,
        var type: Enums.Sign,
        var value: String,
        @Column(name = "create_time") var createTime: Date,
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    )

    @Entity
    @Table(name = "t_user")
    class User(
        @Column(nullable = false) var username: String,
        @Column(nullable = false) var password: String,
        @Column(name = "nick_name") var nickName: String,
        var birthday: String,
        @Column(name = "birthday_type") @ApiParam("公历还是农历: 公历：1， 农历：2") var birthdayType: String,
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @ApiParam(hidden = true) var id: Long? = null,
    )

    @Entity
    @Table(name = "t_financial")
    class Financial(
        var name: String,
        @Column(name = "create_time")
        var createTime: Date,
        var price: Float,
        var count: Int,
        var type: Enums.Financial,
        var note: String? = null,
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long? = null,
    )
}