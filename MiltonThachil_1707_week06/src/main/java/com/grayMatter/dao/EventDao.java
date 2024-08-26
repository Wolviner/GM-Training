package com.grayMatter.dao;

import com.grayMatter.entities.Event;
import com.grayMatter.exceptions.CapacityExceededException;
import com.grayMatter.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class EventDao {

	
	private static final int TOTAL_CAP = 100;
    @Autowired
    private EventRepository eventRepository;

    
    public Event save(Event event) {
    	validateDailyCapacity(event.getDate(), event.getCapacity());
        return eventRepository.save(event);
    }

    
    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }

    
    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    
    public List<Event> findAll() {
        return eventRepository.findAll();
    }

    
    public List<Event> findByLocation(String location) {
        return eventRepository.findByLocation(location);
    }

    
    public List<Event> findByDate(LocalDate date) {
        return eventRepository.findByDate(date);
    }

    
    public boolean existsById(Long id) {
        return eventRepository.existsById(id);
    }
    private void validateDailyCapacity(LocalDate date, int eventCapacity) throws CapacityExceededException {
		List<Event> eventsOnDate = eventRepository.findByDate(date);
	 
	    int usedCap = eventsOnDate.stream().mapToInt(Event::getCapacity).sum();
	 
	    if (usedCap + eventCapacity > TOTAL_CAP) {
	    	throw new CapacityExceededException("Capacity limit exceeded for date: ");
	    }
	}
}
