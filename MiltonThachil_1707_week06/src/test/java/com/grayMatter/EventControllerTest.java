//package com.grayMatter;
//
//import com.grayMatter.controller.EventController;
//import com.grayMatter.dto.EventDto;
//import com.grayMatter.dto.EventDtoView;
//import com.grayMatter.exceptions.EventNotFoundException;
//import com.grayMatter.exceptions.EventServiceException;
//import com.grayMatter.services.EventService;
//import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//import java.time.LocalDate;
//import java.util.Collections;
//import java.util.Optional;
//
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@WebMvcTest(EventController.class)
//public class EventControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Mock
//    private EventService eventService;
//
//    @InjectMocks
//    private EventController eventController;
//
//    public EventControllerTest() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void testCreateEvent() throws Exception {
//        EventDto eventDto = new EventDto(1L, "Event", "Location", LocalDate.now(), null, null, 100);
//        when(eventService.createEvent(any(EventDto.class))).thenReturn(eventDto);
//
//        mockMvc.perform(MockMvcRequestBuilders.post("/events")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"id\":1,\"name\":\"Event\",\"location\":\"Location\",\"date\":\"2024-08-23\",\"startTime\":null,\"endTime\":null,\"capacity\":100}"))
//                .andExpect(status().isCreated())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Event"));
//    }
//
//    @Test
//    public void testGetEvent() throws Exception {
//        EventDtoView eventDtoView = new EventDtoView(1L, "Event", "Location", 100);
//        when(eventService.getEventById(1L)).thenReturn(eventDtoView);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/events/1"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Event"));
//    }
//
//    @Test
//    public void testGetEventNotFound() throws Exception {
//        when(eventService.getEventById(1L)).thenThrow(new EventNotFoundException("Event not found with id 1"));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/events/1"))
//                .andExpect(status().isNotFound())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.message").value("Event not found with id 1"));
//    }
//
//    @Test
//    public void testUpdateEvent() throws Exception {
//        EventDto eventDto = new EventDto(1L, "Updated Event", "Updated Location", LocalDate.now(), null, null, 200);
//        when(eventService.updateEvent(eq(1L), any(EventDto.class))).thenReturn(eventDto);
//
//        mockMvc.perform(MockMvcRequestBuilders.put("/events/1")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"id\":1,\"name\":\"Updated Event\",\"location\":\"Updated Location\",\"date\":\"2024-08-23\",\"startTime\":null,\"endTime\":null,\"capacity\":200}"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Updated Event"));
//    }
//
//    @Test
//    public void testDeleteEvent() throws Exception {
//        doNothing().when(eventService).deleteEvent(1L);
//
//        mockMvc.perform(MockMvcRequestBuilders.delete("/events/1"))
//                .andExpect(status().isNoContent());
//    }
//
//    @Test
//    public void testListAllEvents() throws Exception {
//        EventDtoView eventDtoView = new EventDtoView(1L, "Event", "Location", 100);
//        when(eventService.getAllEvents()).thenReturn(Collections.singletonList(eventDtoView));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/events"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Event"));
//    }
//
//    @Test
//    public void testListEventsByLocation() throws Exception {
//        EventDtoView eventDtoView = new EventDtoView(1L, "Event", "Location", 100);
//        when(eventService.getEventsByLocation("Location")).thenReturn(Collections.singletonList(eventDtoView));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/events/location/Location"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Event"));
//    }
//
//    @Test
//    public void testListEventsByDate() throws Exception {
//        EventDtoView eventDtoView = new EventDtoView(1L, "Event", "Location", 100);
//        when(eventService.getEventsByDate(LocalDate.parse("2024-08-23"))).thenReturn(Collections.singletonList(eventDtoView));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/events/date/2024-08-23"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Event"));
//    }
//
//    @Test
//    public void testCheckAvailability() throws Exception {
//        when(eventService.checkAvailability(1L)).thenReturn(true);
//
//        mockMvc.perform(MockMvcRequestBuilders.get("/events/1/availability"))
//                .andExpect(status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("$.value").value(true));
//    }
//}
