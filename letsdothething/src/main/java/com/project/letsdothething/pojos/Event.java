package com.project.letsdothething.pojos;

public class Event {
    private String eventName;

    public Event(String eventName) {
        this.eventName = eventName;
    }

    public Event() {
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
