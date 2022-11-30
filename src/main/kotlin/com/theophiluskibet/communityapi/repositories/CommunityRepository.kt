package com.theophiluskibet.communityapi.repositories

import com.theophiluskibet.communityapi.models.Community
import org.springframework.data.jpa.repository.JpaRepository

interface CommunityRepository : JpaRepository<Community, Long>