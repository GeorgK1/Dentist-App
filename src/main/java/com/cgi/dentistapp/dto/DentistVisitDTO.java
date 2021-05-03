package com.cgi.dentistapp.dto;

import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;

public class DentistVisitDTO {

    @NotNull
    @Size(min = 1, max = 50)
    String dentistName;
    //Validates if entered name matches any of unicode property, regex gotten from https://stackoverflow.com/questions/15805555/java-regex-to-validate-full-name-allow-only-spaces-and-letters
    @Pattern(regexp="^[\\p{L} .'-]+$", message = "Numbrid ja muud tähemärgid ei ole lubatud.")
    @Size(min = 1, max = 50)
    String clientName;

    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    //to ensure no registrations to the past
    @Future(message = "Aeg tuleb panna tulevikku")
    Date visitDate;

    @NotNull
    @Size(min = 1, max = 5)
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
