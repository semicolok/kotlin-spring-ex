package com.example.kotlinspringex.repository.user

import com.example.kotlinspringex.contoller.dto.UserResponseDto
import org.mapstruct.IterableMapping
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
interface UserMapper {

    fun toUserResponseDto(user: User): UserResponseDto

    @IterableMapping(elementTargetType = UserResponseDto::class)
    fun mapListToUserResponseDtoList(userList: List<User>): List<UserResponseDto>
}