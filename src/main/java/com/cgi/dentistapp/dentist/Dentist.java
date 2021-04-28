package com.cgi.dentistapp.dentist;

public class Dentist {
    private String name;
    private Integer workingExperience;
    private String email;

    public Dentist(){

    }

    public Dentist(String name, Integer workingExperience, String email) {
        this.name = name;
        this.workingExperience = workingExperience;
        this.email = email;
    }
    //getters for doctor class
    public String getName() {
        return name;
    }
    public Integer getWorkingExperience() {
        return workingExperience;
    }
    public String getEmail() {
        return email;
    }
    //setters for doctor class
    public void setName(String name) {
        this.name = name;
    }
    public void setWorkingExperience(Integer workingExperience) {
        this.workingExperience = workingExperience;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
