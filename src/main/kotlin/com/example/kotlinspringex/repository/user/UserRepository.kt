package com.example.kotlinspringex.repository.user

import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, UUID> {
    fun findByName(name: String): Iterable<User>
}
