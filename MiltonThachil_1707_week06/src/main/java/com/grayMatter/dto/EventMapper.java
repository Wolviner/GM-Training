package com.grayMatter.dto;

import org.springframework.stereotype.Component;

import com.grayMatter.entities.Event;

@Component
public class EventMapper {

    // Maps EventDto to Event entity
    public Event mapToEvent(EventDto eventDTO) {
        return new Event(
            eventDTO.getId(),
            eventDTO.getName(),
            eventDTO.getLocation(),
            eventDTO.getDate(),
            eventDTO.getStartTime(),
            eventDTO.getEndTime(),
            eventDTO.getCapacity()
        );
    }

    // Maps Event entity to EventDto
    public EventDto mapToEventDto(Event event) {
        return EventDto.builder()
            .id(event.getId())
            .name(event.getName())
            .location(event.getLocation())
            .date(event.getDate())
            .startTime(event.getStartTime())
            .endTime(event.getEndTime())
            .capacity(event.getCapacity())
            .build();
    }

    // Maps Event entity to EventDtoView (with id, name, location, and capacity)
    public EventDtoView mapToEventDtoView(Event event) {
        return EventDtoView.builder()
            .id(event.getId())
            .name(event.getName())
            .location(event.getLocation())
            .capacity(event.getCapacity())
            .build();
    }
}

