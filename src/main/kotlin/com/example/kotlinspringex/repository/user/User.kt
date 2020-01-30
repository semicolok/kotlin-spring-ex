package com.example.kotlinspringex.repository.user

import java.time.LocalDateTime
import java.util.*
import javax.persistence.*

@Entity
@Table(name = "USER")
data class User(

        @Id
        @GeneratedValue
        @Column(name = "USER_ID", nullable = false)
        var userId: UUID?,

        @Column(name = "NAME", nullable = false)
        var name: String,

        @Column(name = "EMAIL", nullable = false)
        var email: String,

        @Column(name = "UPDATED_TIME", nullable = false)
        var updatedTime: LocalDateTime = LocalDateTime.now(),

        @Column(name = "CREATED_TIME", nullable = false)
        var createdTime: LocalDateTime = LocalDateTime.now()
)