package com.example.kotlinspringex.repository.record

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Record(

        @Id
        @GeneratedValue
        var seq: Long?,

        @Column(name = "EXERCISE_NAME", nullable = false)
        var exerciseName: String,

        @Column(name = "RECORD_WEIGHT", nullable = false)
        var recordWeight: String
)