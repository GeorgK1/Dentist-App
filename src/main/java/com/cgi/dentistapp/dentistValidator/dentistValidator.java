package com.cgi.dentistapp.dentistValidator;

import com.cgi.dentistapp.doctors.Doctor;
import org.springframework.validation.Errors;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.executable.ExecutableValidator;
import javax.validation.metadata.BeanDescriptor;
import java.util.ArrayList;
import java.util.Set;

public class dentistValidator implements Validator {
    // This validator checks if name is on the dentist list
    public void validate(Errors e, String dentistName) {
        //Available dentists
        ArrayList<Doctor> doctorArrayList = new ArrayList<Doctor>();
        doctorArrayList.add(new Doctor("Juku Juhan", 15, "jukujuhan@mail.com"));
        doctorArrayList.add(new Doctor("Kalle Karl", 14, "karlkalle@mail.com"));
        doctorArrayList.add(new Doctor("Peeter Pets", 10, "peeterpets@mail.com"));
        doctorArrayList.add(new Doctor("Malle Mari", 25, "mallemari@mail.com"));
        doctorArrayList.add(new Doctor("Malle Kalle", 15, "mallekalle@mail.com"));
        // Looping over the dentists, seeing if there is some dentist that matches the user input
        for (Doctor doctor:doctorArrayList) {
            if(!doctor.getName().equals(dentistName)){
                e.rejectValue("name", "invalid name");
            }
        }
    }

}
