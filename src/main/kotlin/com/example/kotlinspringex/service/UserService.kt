package com.example.kotlinspringex.service

import com.example.kotlinspringex.contoller.dto.UserResponseDto
import com.example.kotlinspringex.repository.user.UserMapper
import com.example.kotlinspringex.repository.user.UserRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserService(
        val userMapper: UserMapper,
        val userRepository: UserRepository) {

    fun getUsers(): List<UserResponseDto> {
        val userList = userRepository.findAll()

        return userMapper.mapListToUserResponseDtoList(userList)
    }

    fun getUserById(userId: String): UserResponseDto {
        val user = userRepository.getOne(UUID.fromString(userId))

        return userMapper.toUserResponseDto(user)
    }
}