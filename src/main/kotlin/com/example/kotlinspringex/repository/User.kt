package com.example.kotlinspringex.repository

import java.time.LocalDateTime
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User(

        @Id
        @GeneratedValue
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