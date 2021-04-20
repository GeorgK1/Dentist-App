package com.cgi.dentistapp.dto;

import com.cgi.dentistapp.dentistValidator.dentistValidator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.ConstraintViolation;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.Date;
import java.util.Set;

public class DentistVisitDTO {
    dentistValidator dentistValidator = new dentistValidator();
    @Size(min = 1, max = 50)
    @dentistValidator.validate()
    String dentistName;

    @NotNull


    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Future

    Date visitTime;

    public DentistVisitDTO() {
    }

    public DentistVisitDTO(String dentistName, Date visitTime) {
        this.dentistName = dentistName;
        this.visitTime = visitTime;
    }

    public String getDentistName() {
        return dentistName;
    }

    public void setDentistName(String dentistName) {

        this.dentistName = dentistName;
    }

    public Date getVisitTime() {

        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }
}
