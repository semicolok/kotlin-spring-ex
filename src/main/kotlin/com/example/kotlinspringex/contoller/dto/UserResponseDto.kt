package com.example.kotlinspringex.contoller.dto

class UserResponseDto(
        var name: String?,
        var email: String?
) {
    constructor() : this(null, null)
}