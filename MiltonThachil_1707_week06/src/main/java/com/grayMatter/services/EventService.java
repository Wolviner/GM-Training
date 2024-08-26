package com.grayMatter.services;

import com.grayMatter.dao.EventDao;
import com.grayMatter.dto.EventDto;
import com.grayMatter.dto.EventDtoView;
import com.grayMatter.dto.EventMapper;
import com.grayMatter.entities.Event;
import com.grayMatter.exceptions.EventNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EventService implements EventServiceInterface {

    @Autowired
    private EventDao eventDao;

    @Autowired
    private EventMapper eventMapper;  // Inject the EventMapper

    @Override
    @Transactional
    public EventDto createEvent(EventDto eventDTO) {
        Event event = eventMapper.mapToEvent(eventDTO);
        Event savedEvent = eventDao.save(event);
        return eventMapper.mapToEventDto(savedEvent);
    }

    @Override
    public EventDtoView getEventById(Long id) {
        Event event = eventDao.findById(id)
            .orElseThrow(() -> new EventNotFoundException("Event not found with id " + id));
        return eventMapper.mapToEventDtoView(event);
    }

    @Override
    @Transactional
    public EventDto updateEvent(Long id, EventDto eventDTO) {
        if (!eventDao.existsById(id)) {
            throw new EventNotFoundException("Event not found with id " + id);
        }
        Event event = eventMapper.mapToEvent(eventDTO);
        event.setId(id);
        Event updatedEvent = eventDao.save(event);
        return eventMapper.mapToEventDto(updatedEvent);
    }

    @Override
    @Transactional
    public void deleteEvent(Long id) {
        if (!eventDao.existsById(id)) {
            throw new EventNotFoundException("Event not found with id " + id);
        }
        eventDao.deleteById(id);
    }

    @Override
    public List<EventDtoView> getAllEvents() {
        return eventDao.findAll().stream()
            .map(eventMapper::mapToEventDtoView)
            .collect(Collectors.toList());
    }

    @Override
    public List<EventDtoView> getEventsByLocation(String location) {
        return eventDao.findByLocation(location).stream()
            .map(eventMapper::mapToEventDtoView)
            .collect(Collectors.toList());
    }

    @Override
    public List<EventDtoView> getEventsByDate(LocalDate date) {
        return eventDao.findByDate(date).stream()
            .map(eventMapper::mapToEventDtoView)
            .collect(Collectors.toList());
    }

    @Override
    public boolean checkAvailability(Long id) {
        Event event = eventDao.findById(id)
            .orElseThrow(() -> new EventNotFoundException("Event not found with id " + id));
        return event.getCapacity() > 0;
    }
}
