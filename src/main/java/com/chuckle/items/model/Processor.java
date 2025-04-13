package com.chuckle.items.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Processor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String intel;
    private String amd;

    // Constructors
    public Processor() {}

    public Processor(String intel, String amd) {
        this.intel = intel;
        this.amd = amd;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntel() {
        return intel;
    }

    public void setIntel(String intel) {
        this.intel = intel;
    }

    public String getAmd() {
        return amd;
    }

    public void setAmd(String amd) {
        this.amd = amd;
    }
}