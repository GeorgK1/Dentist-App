package com.cgi.dentistapp.doctors;

public class Doctor {
    private String name;
    private Integer workingExperience;
    private String email;

    public Doctor(){

    }

    public Doctor (String name, Integer workingExperience, String email) {
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
