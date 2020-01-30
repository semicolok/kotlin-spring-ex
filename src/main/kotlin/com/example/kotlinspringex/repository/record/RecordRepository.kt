package com.example.kotlinspringex.repository.record

import org.springframework.data.jpa.repository.JpaRepository

interface RecordRepository : JpaRepository<Record, Long> {
}