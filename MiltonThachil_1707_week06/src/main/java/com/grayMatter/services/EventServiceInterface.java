package com.grayMatter.services;
import com.grayMatter.dto.EventDto;
import com.grayMatter.dto.EventDtoView;
import com.grayMatter.entities.Event;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EventServiceInterface {



    

    EventDtoView getEventById(Long id);

    

    void deleteEvent(Long id);

    List<EventDtoView> getAllEvents();

    List<EventDtoView> getEventsByLocation(String location);

    List<EventDtoView> getEventsByDate(LocalDate date);

    boolean checkAvailability(Long id);

	EventDto updateEvent(Long id, EventDto eventDTO);

	EventDto createEvent(EventDto eventDTO);
}

