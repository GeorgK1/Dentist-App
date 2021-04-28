package com.cgi.dentistapp.dentistValidator;

import com.cgi.dentistapp.dentist.Dentist;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;

public class DentistExistsValidator implements ConstraintValidator<DentistExists, String> {
    //Available dentists


    @Override
    public void initialize(DentistExists dentistExists) {
    }

    @Override
    public boolean isValid(String dentistName, ConstraintValidatorContext constraintValidatorContext) {
        //Dentistlist
        ArrayList<Dentist> dentistArrayList = new ArrayList<>();
        dentistArrayList.add(new Dentist("Peeter Porgand", 14, "karlkalle@mail.com"));
        dentistArrayList.add(new Dentist("Peeter Pets", 10, "peeterpets@mail.com"));
        dentistArrayList.add(new Dentist("Malle Mari", 25, "mallemari@mail.com"));
        dentistArrayList.add(new Dentist("Juku Juhan", 15, "jukujuhan@mail.com"));
        dentistArrayList.add(new Dentist("Malle Kalle", 15, "mallekalle@mail.com"));
        Boolean returnValue = false;
        //for each dentist in the list, if their name is equal to the input set returnvalue to true
        for (Dentist Dentist:dentistArrayList) {
            if(Dentist.getName().equals(dentistName)){
                returnValue = true;
                break;
            }
    }
        return returnValue;
    }
}