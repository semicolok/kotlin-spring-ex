package com.example.kotlinspringex.contoller

import com.example.kotlinspringex.contoller.dto.UserResponseDto
import com.example.kotlinspringex.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
        val userService: UserService) {

    @GetMapping("/users")
    fun getUsers(): List<UserResponseDto> {
        return userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    fun getUsers(@PathVariable userId: String): UserResponseDto {
        return userService.getUserById(userId);
    }
}