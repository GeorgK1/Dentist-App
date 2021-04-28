package com.cgi.dentistapp.service;

import com.cgi.dentistapp.entity.DentistVisitEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class DentistVisitService {

    public void addVisit(String dentistName, Date visitDate, String visitTime, String clientName) {
        //TODO implementation
        //DentistVisitEntity dentistVisitEntity = new DentistVisitEntity();

        System.out.println(dentistName);
        System.out.println(clientName);
        System.out.println(visitTime);
        System.out.println(visitDate);
    }
}
