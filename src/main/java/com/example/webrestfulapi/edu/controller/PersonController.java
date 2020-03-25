package com.example.webrestfulapi.edu.controller;

import com.example.webrestfulapi.edu.model.Address;
import com.example.webrestfulapi.edu.model.Person;
import com.example.webrestfulapi.edu.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/connection", method = RequestMethod.GET)
    public String isConnect() {
        return "Connection!";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @PostMapping()
    public boolean createPerson(@RequestParam String person_name, String address_name, String city_name) {
        Address address = new Address(address_name, city_name);
        Person person = new Person(person_name, address);
        return personService.createPerson(person);
    }

}
