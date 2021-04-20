package com.cgi.dentistapp.service;

import com.cgi.dentistapp.doctors.Doctor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DentistVisitService {

    public void addVisit(String dentistName, Date visitTime) {
        //TODO implementation


        System.out.println(dentistName);
        System.out.println(visitTime);
    }
}
