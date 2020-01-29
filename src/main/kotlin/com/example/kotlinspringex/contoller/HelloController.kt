package com.example.kotlinspringex.contoller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): Map<Any, String> {
        val map = mapOf("hello" to "world", 1 to "one", 2 to "two")

        return map;
    }
}