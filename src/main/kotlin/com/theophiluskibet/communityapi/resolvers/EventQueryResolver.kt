package com.theophiluskibet.communityapi.resolvers

import com.theophiluskibet.communityapi.services.EventsService
import graphql.kickstart.tools.GraphQLQueryResolver
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EventQueryResolver(@Autowired private val eventsService: EventsService) : GraphQLQueryResolver {
    fun getEvents() = eventsService.getAll()
}