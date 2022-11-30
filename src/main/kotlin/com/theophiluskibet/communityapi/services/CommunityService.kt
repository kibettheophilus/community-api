package com.theophiluskibet.communityapi.services

import com.theophiluskibet.communityapi.models.Community
import com.theophiluskibet.communityapi.repositories.CommunityRepository
import org.springframework.stereotype.Service

@Service
class CommunityService(private val communityRepository: CommunityRepository) {

    fun getAll(): List<Community> = communityRepository.findAll()

    fun save(community: Community) = communityRepository.save(community)
}