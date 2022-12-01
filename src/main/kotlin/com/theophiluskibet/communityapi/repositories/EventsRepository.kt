package com.theophiluskibet.communityapi.repositories

import com.theophiluskibet.communityapi.models.Event
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EventsRepository : MongoRepository<Event, String>