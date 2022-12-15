package com.theophiluskibet.communityapi.repositories

import com.theophiluskibet.communityapi.models.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<User, String> {
    fun findByEmail(email: String): User
}