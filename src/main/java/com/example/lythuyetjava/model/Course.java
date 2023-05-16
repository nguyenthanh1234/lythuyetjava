package com.example.lythuyetjava.model;

import java.time.LocalDate;

public class Course {

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLectureName() {
        return lectureName;
    }
    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Course(int id, String lectureName, String place, LocalDate startDate) {
        super();
        this.id = id;
        this.lectureName = lectureName;
        this.place = place;
        this.startDate = startDate;
    }
    private int id;

    public Course() {
    }

    private String lectureName;
    private String place;
    private LocalDate startDate;
}
