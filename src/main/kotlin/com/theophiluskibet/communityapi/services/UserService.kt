package com.theophiluskibet.communityapi.services

import com.theophiluskibet.communityapi.models.User
import com.theophiluskibet.communityapi.repositories.UserRepository
import com.theophiluskibet.communityapi.utils.ResponseHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service

@Service
class UserService(@Autowired private val userRepository: UserRepository) {
    fun createUser(user: User) {
        if (user.email.isNullOrEmpty() || user.firstName.isNullOrEmpty() || user.lastName.isNullOrEmpty() || user.password.isNullOrEmpty()) {
            ResponseHandler(
                code = HttpStatus.NOT_ACCEPTABLE.value(),
                success = false,
                message = "Some fields are blank",
                data = null
            )
        } else userRepository.save(user)
    }

    fun getAllUsers() = userRepository.findAll()
}