package com.example.kotlinspringex.service

import com.example.kotlinspringex.repository.record.RecordRepository
import org.springframework.stereotype.Service

@Service
class RecordService(
        val recordRepository: RecordRepository) {
}