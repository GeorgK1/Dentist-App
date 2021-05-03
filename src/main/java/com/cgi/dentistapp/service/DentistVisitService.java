package com.cgi.dentistapp.service;

import com.cgi.dentistapp.entity.DentistVisitEntity;
import com.cgi.dentistapp.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class DentistVisitService {
    @Autowired
    EntityRepository entityRepository;
    // this method is called when form is submitted, it uses its parameters to make a new entity object which gets stored into the repository.
    public void addVisit(String dentistName, Date visitDate, String visitTime, String clientName) {
        System.out.println(dentistName);
        System.out.println(visitDate);
        System.out.println(visitTime);
        System.out.println(clientName);
        DentistVisitEntity dentistVisitEntity = new DentistVisitEntity(clientName, dentistName, visitDate, visitTime);
        entityRepository.save(dentistVisitEntity);
    }
    //this gotten from https://stackabuse.com/integrating-h2-database-with-spring-boot/
    public List<DentistVisitEntity> viewAllVisits(){
        List<DentistVisitEntity> dentistVisitEntities = new ArrayList<DentistVisitEntity>();
        entityRepository.findAll().forEach(entity -> dentistVisitEntities.add(entity));
        System.out.println(dentistVisitEntities);
        return dentistVisitEntities;
    }

    public void delete(long id) {
        entityRepository.delete(id);
    }
}
