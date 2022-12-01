package com.theophiluskibet.communityapi.services

import com.theophiluskibet.communityapi.models.Event
import com.theophiluskibet.communityapi.repositories.EventsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventsService(@Autowired private val eventsRepository: EventsRepository) {
    fun getAll() = eventsRepository.findAll()

    fun saveEvent(event: Event) = eventsRepository.save(event)
}