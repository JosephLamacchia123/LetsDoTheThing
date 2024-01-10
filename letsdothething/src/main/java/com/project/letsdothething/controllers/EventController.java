package com.project.letsdothething.controllers;

import com.project.letsdothething.pojos.Event;
import com.project.letsdothething.repositories.EventRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EventController {

    private EventRepository eventRepository;

    @GetMapping("/event")
    public String returnEventName() {
        return "In return event method";
    }

    @PostMapping("/event")
    public Event createEvent(@RequestBody Event event){
        return event;
    }

}
