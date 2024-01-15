package com.project.letsdothething.pojos;

import jakarta.persistence.*;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Event(String name) {
        this.name = name;
    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setEventName(String name) {
        this.name = name;
    }
}
