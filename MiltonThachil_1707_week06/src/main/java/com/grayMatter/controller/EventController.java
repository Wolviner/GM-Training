package com.grayMatter.controller;

import com.grayMatter.dto.EventDto;
import com.grayMatter.dto.EventDtoView;
import com.grayMatter.exceptions.CapacityExceededException;
import com.grayMatter.exceptions.EventNotFoundException;
import com.grayMatter.exceptions.EventServiceException;
import com.grayMatter.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @PostMapping
    public ResponseEntity<EventDto> createEvent(@Valid @RequestBody EventDto eventDTO) {
        try {
            EventDto createdEvent = service.createEvent(eventDTO);
            return new ResponseEntity<>(createdEvent, HttpStatus.CREATED);
        } catch (Exception e) {
            throw new CapacityExceededException("Date not available");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDtoView> getEvent(@PathVariable Long id) {
        try {
            EventDtoView event = service.getEventById(id);
            return ResponseEntity.ok(event);
        } catch (EventNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new EventServiceException("Failed to retrieve event");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventDto> updateEvent(@PathVariable Long id, @Valid @RequestBody EventDto eventDTO) {
        try {
            EventDto updatedEvent = service.updateEvent(id, eventDTO);
            return ResponseEntity.ok(updatedEvent);
        } catch (EventNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new EventServiceException("Failed to update event");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvent(@PathVariable Long id) {
        try {
            service.deleteEvent(id);
            return ResponseEntity.noContent().build();
        } catch (EventNotFoundException e) {
            throw e;
        } catch (Exception e) {
            throw new EventServiceException("Failed to delete event");
        }
    }

    @GetMapping
    public ResponseEntity<List<EventDtoView>> listAllEvents() {
        List<EventDtoView> events = service.getAllEvents();
        return ResponseEntity.ok(events);
    }

    @GetMapping("/location/{location}")
    public ResponseEntity<List<EventDtoView>> listEventsByLocation(@PathVariable String location) {
        List<EventDtoView> events = service.getEventsByLocation(location);
        return ResponseEntity.ok(events);
    }

    @GetMapping("/date/{date}")
    public ResponseEntity<List<EventDtoView>> listEventsByDate(@PathVariable LocalDate date) {
        List<EventDtoView> events = service.getEventsByDate(date);
        return ResponseEntity.ok(events);
    }

    @GetMapping("/{id}/availability")
    public ResponseEntity<Boolean> checkAvailability(@PathVariable Long id) {
        boolean available = service.checkAvailability(id);
        return ResponseEntity.ok(available);
    }
}
