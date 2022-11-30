package com.theophiluskibet.communityapi.services

import com.theophiluskibet.communityapi.models.Community
import com.theophiluskibet.communityapi.repositories.CommunityRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CommunityService(private val communityRepository: CommunityRepository) {

    fun getAllCommunities(): List<Community> = communityRepository.findAll()

    fun saveCommuniy(community: Community) = communityRepository.save(community)

    fun getCommunityById(id: Long) =
        communityRepository.findByIdOrNull(id) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND)

    fun deleteCommunityById(id: Long) =
        if (communityRepository.existsById(id)) communityRepository.deleteById(id) else throw ResponseStatusException(
            HttpStatus.NOT_FOUND
        )

    // update community
}