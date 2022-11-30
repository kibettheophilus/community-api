package com.theophiluskibet.communityapi.controllers

import com.theophiluskibet.communityapi.models.Community
import com.theophiluskibet.communityapi.services.CommunityService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/communities")
class CommunityController(private val communityService: CommunityService) {
    @GetMapping
    fun getCommunites(): List<Community> = communityService.getAllCommunities()

    @GetMapping("/{id}")
    fun getCommunity(@PathVariable id: Long) = communityService.getCommunityById(id)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun saveCommunity(@RequestBody community: Community) = communityService.saveCommuniy(community)

    @DeleteMapping("/{id}")
    fun deleteCommunity(@PathVariable id: Long) = communityService.deleteCommunityById(id)

}