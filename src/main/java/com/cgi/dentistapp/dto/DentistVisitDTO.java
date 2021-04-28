package com.cgi.dentistapp.dto;

import com.cgi.dentistapp.dentistValidator.DentistExists;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class DentistVisitDTO {

    @Size(min = 1, max = 50)
    @DentistExists(message = "Seda hambaarsti ei eksisteeri")
    String dentistName;

    String clientName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //to ensure no registrations to the past
    @Future
    Date visitDate;

    String visitTime;
    public DentistVisitDTO() {
    }

    public DentistVisitDTO(String dentistName, Date visitDate, String visitTime, String clientName) {
        this.dentistName = dentistName;
        this.clientName = clientName;
        this.visitDate = visitDate;
        this.visitTime = visitTime;

    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {

        this.dentistName = dentistName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
