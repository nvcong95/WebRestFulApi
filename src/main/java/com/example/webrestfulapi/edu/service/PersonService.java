package com.example.webrestfulapi.edu.service;

import com.example.webrestfulapi.edu.dao.PersonDAO;
import com.example.webrestfulapi.edu.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    PersonDAO personDAO;

    @Autowired
    public PersonService(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public boolean createPerson(Person person) {
        return personDAO.insertPerson(person);
    }

    public List<Person> getAllPerson() {
        return personDAO.getAllPerson();
    }

    public Person findById(int id) {
        return personDAO.findbyId(id);
    }

}
