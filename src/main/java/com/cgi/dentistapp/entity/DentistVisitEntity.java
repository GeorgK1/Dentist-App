package com.cgi.dentistapp.entity;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DentistVisitEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String clientName;
    private String doctorName;
    private Date registrationDate;
    private String registrationTime;

    public DentistVisitEntity(){}

    public DentistVisitEntity(String clientName, String doctorName, Date registrationDate, String registrationTime){
        this.clientName = clientName;
        this.doctorName = doctorName;
        this.registrationDate = registrationDate;
        this.registrationTime = registrationTime;
    }
    //getters and setters
    public Long getId() {
        return id;
    }

    public String getClientName() {
        return clientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public String getRegistrationTime() {
        return registrationTime;
    }


}
