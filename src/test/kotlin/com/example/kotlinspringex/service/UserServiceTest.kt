package com.example.kotlinspringex.service

import io.kotlintest.matchers.collections.shouldHaveSize
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.spring.SpringListener

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserServiceTest : StringSpec() {

    override fun listeners() = listOf(SpringListener)

    @Autowired
    var userService: UserService? = null

    init {
        "When getUsers then return 2 size list" {
            userService!!.getUsers() shouldHaveSize 2
        }

        "When getUserById then return User" {
            userService!!.getUserById("f4522bfd-763b-406c-a707-d737f7faf9c7").name shouldBe "Jake Jungu Han"
        }
    }
}