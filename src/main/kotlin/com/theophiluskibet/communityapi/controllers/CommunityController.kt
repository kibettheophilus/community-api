package com.theophiluskibet.communityapi.controllers

import com.theophiluskibet.communityapi.models.Community
import com.theophiluskibet.communityapi.services.CommunityService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class CommunityController(private val communityService: CommunityService) {

    @GetMapping
    fun getCommunites(): List<Community> = communityService.getAll()

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody community: Community) = communityService.save(community)
}