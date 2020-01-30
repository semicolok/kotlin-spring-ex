package com.example.kotlinspringex.repository.record

import com.example.kotlinspringex.repository.user.User
import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "RECORD")
data class Record(

        @Id
        @GeneratedValue
        @Column(name = "RECORD_ID", nullable = false)
        var recordId: Long?,

        @Column(name = "EXERCISE_NAME", nullable = false)
        var exerciseName: String,

        @Column(name = "RECORD_WEIGHT", nullable = false)
        var recordWeight: String,

        @ManyToOne(targetEntity = User::class, fetch = FetchType.LAZY)
        @JoinColumn(name = "USER_ID")
        var user: User,

        @Column(name = "UPDATED_TIME", nullable = false)
        var updatedTime: LocalDateTime = LocalDateTime.now(),

        @Column(name = "CREATED_TIME", nullable = false)
        var createdTime: LocalDateTime = LocalDateTime.now()
)