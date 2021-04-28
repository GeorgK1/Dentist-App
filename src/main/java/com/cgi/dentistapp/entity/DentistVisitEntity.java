package com.cgi.dentistapp.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "DENTIST_VISIT")
public class DentistVisitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private final UUID id;

    @Column(name = "CLIENTNAME")
    private final String ClientName;

    @Column(name = "DOCTORNAME")
    private final String DoctorName;

    @Column(name = "REGISTRATIONDATE")
    private final Date RegistrationDate;

    @Column(name = "SUBMITDATE")
    private final Date SubmitDate;


    public DentistVisitEntity(UUID id, String ClientName, String DoctorName, Date registrationDate, Date SubmitDate){

        this.id = id;
        this.ClientName = ClientName;
        this.DoctorName = DoctorName;
        this.RegistrationDate = registrationDate;
        this.SubmitDate = SubmitDate;
    }
    //TODO implementation

    public UUID getId() {
        return id;
    }

    public String getClientName() {
        return ClientName;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public Date getRegistrationDate() {
        return RegistrationDate;
    }

    public Date getSubmitDate() {
        return SubmitDate;
    }

}
