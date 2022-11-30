package com.theophiluskibet.communityapi.services

import com.theophiluskibet.communityapi.models.Community
import com.theophiluskibet.communityapi.repositories.CommunityRepository
import com.theophiluskibet.communityapi.utils.SuccessResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatusCode
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException
import java.net.http.HttpResponse

@Service
class CommunityService(private val communityRepository: CommunityRepository) {

    fun getAllCommunities(): List<Community> = communityRepository.findAll()

    fun saveCommuniy(community: Community) =
        if (community.name.isNullOrEmpty()) SuccessResponse(
            success = false,
            message = "Name cannot be blank",
            data = null
        ) else communityRepository.save(community)

    fun getCommunityById(id: Long): SuccessResponse? {
        val community = communityRepository.findById(id)
        return if (community.isEmpty) {
            SuccessResponse(success = false, message = "Not communities found with id: $id", data = null)
        } else
            SuccessResponse(success = true, message = "Community fetched successfully", data = community)
    }

    fun deleteCommunityById(id: Long) =
        if (communityRepository.existsById(id)) communityRepository.deleteById(id) else throw ResponseStatusException(
            HttpStatus.NOT_FOUND
        )

    // update community
}