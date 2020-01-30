package com.example.kotlinspringex.repository.user

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
        val testUser = User(userId = null, name = "testUser", email = "testuser@gmail.com")
        entityManager.persist(testUser)
        entityManager.flush()
        val user = userRepository.getOne(testUser.userId!!)

        assertThat(user).isEqualTo(testUser)
    }

    @Test
    fun `When findByName then return User`() {
        val testUser = User(userId = null, name = "testUser01", email = "testuser@gmail.com")
        entityManager.persist(testUser)
        entityManager.flush()
        val users = userRepository.findByName(testUser.name)

        assertEquals(1, users.count())
        assertThat(users).containsExactlyInAnyOrder(testUser)
    }
}