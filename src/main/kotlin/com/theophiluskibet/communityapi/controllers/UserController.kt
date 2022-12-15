package com.theophiluskibet.communityapi.controllers

import com.theophiluskibet.communityapi.models.User
import com.theophiluskibet.communityapi.services.UserService
import com.theophiluskibet.communityapi.utils.ResponseHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/users")
class UserController(@Autowired private val userService: UserService) {

    @PostMapping("/user")
    fun createUser(@RequestBody user: User): ResponseEntity<ResponseHandler> {
        userService.createUser(user)
        return ResponseEntity.ok(
            ResponseHandler(
                code = 200,
                success = true,
                message = "Account created successfully",
                data = user
            )
        )
    }

    @GetMapping
    fun getAllUsers(): ResponseEntity<ResponseHandler> {
        val users = userService.getAllUsers()
        return ResponseEntity.ok(
            ResponseHandler(
                code = 200,
                success = true,
                message = "Users fetched successfully",
                data = users
            )
        )
    }
}