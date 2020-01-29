package com.example.kotlinspringex.repository

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager

@DataJpaTest
class UserRepositoryTest @Autowired constructor(
        val entityManager: TestEntityManager,
        val userRepository: UserRepository) {

    @Test
    fun `When findById then return User`() {
        val jungu = User(userId = null, name = "Jungu", email = "semicolok@gmail.com")
        entityManager.persist(jungu)
        entityManager.flush()
        val user = userRepository.getOne(jungu.userId!!)

        assertThat(user).isEqualTo(jungu)
    }

    @Test
    fun `When findByName then return User`() {
        val jungu = User(userId = null, name = "Jungu", email = "semicolok@gmail.com")
        entityManager.persist(jungu)
        entityManager.flush()
        val users = userRepository.findByName(jungu.name)

        assertEquals(1, users.count())
        assertThat(users).containsExactlyInAnyOrder(jungu)
    }
}