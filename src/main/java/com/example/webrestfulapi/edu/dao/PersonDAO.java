package com.example.webrestfulapi.edu.dao;

import com.example.webrestfulapi.edu.model.Person;

import java.util.List;

public interface PersonDAO {
    List<Person> getAllPerson();
    List<Person> findByName(String name);
    Person findbyId(int id);
    boolean insertPerson(Person person);
    boolean updatePerson(Person person);
    boolean deletePerson(Person person);
    boolean deletePerson(int id);


}
