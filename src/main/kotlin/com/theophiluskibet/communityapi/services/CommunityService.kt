package com.theophiluskibet.communityapi.services

import com.theophiluskibet.communityapi.models.Community
import com.theophiluskibet.communityapi.repositories.CommunityRepository
import com.theophiluskibet.communityapi.utils.ResponseHandler
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class CommunityService(private val communityRepository: CommunityRepository) {
    fun getAllCommunities(): ResponseHandler? {
        val communities = communityRepository.findAll()
        return if (!communities.isNullOrEmpty()) {
            ResponseHandler(
                code = HttpStatus.OK.value(),
                success = true,
                message = "Communities fetched successfully",
                data = communities
            )
        } else
            ResponseHandler(code = HttpStatus.OK.value(), success = true, message = "No communities found", data = null)

    }

    fun saveCommuniy(community: Community): ResponseHandler? =
        if (community.name.isNullOrEmpty()) {
            ResponseHandler(
                code = HttpStatus.NOT_ACCEPTABLE.value(),
                success = false,
                message = "Name cannot be blank",
                data = null
            )
        } else {
            communityRepository.save(community)
            ResponseHandler(
                code = HttpStatus.CREATED.value(),
                success = true,
                message = "Community created successfully",
                data = communityRepository.findAll().last()
            )
        }

    fun getCommunityById(id: Long): ResponseHandler? {
        val community = communityRepository.findById(id)
        return if (community.isEmpty) {
            ResponseHandler(
                code = HttpStatus.NOT_FOUND.value(),
                success = false,
                message = "Not communities found with id: $id",
                data = null
            )
        } else
            ResponseHandler(
                code = HttpStatus.OK.value(),
                success = true,
                message = "Community fetched successfully",
                data = community
            )
    }

    fun deleteCommunityById(id: Long) =
        if (communityRepository.existsById(id)) communityRepository.deleteById(id) else throw ResponseStatusException(
            HttpStatus.NOT_FOUND
        )

    // update community
}