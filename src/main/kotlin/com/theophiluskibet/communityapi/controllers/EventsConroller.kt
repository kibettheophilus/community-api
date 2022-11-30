package com.theophiluskibet.communityapi.controllers

import com.theophiluskibet.communityapi.models.Event
import com.theophiluskibet.communityapi.services.EventsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/events")
class EventsConroller(@Autowired private val eventsService: EventsService) {
    @GetMapping
    fun getAll() = eventsService.getAll()

    @PostMapping
    fun saveEvent(@RequestBody event: Event) = eventsService.saveEvent(event)
}