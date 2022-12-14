package com.theophiluskibet.communityapi.repositories

import com.theophiluskibet.communityapi.models.Community
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface CommunityRepository : MongoRepository<Community, String>