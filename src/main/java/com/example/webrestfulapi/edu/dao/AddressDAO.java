package com.example.webrestfulapi.edu.dao;

import com.example.webrestfulapi.edu.model.Address;
import com.example.webrestfulapi.edu.model.Person;

import java.util.List;

public interface AddressDAO {
    List<Address> getAllAddress();
    List<Address> findByCity(String city);
    List<Address> findByName(String name);
    Person findbyId(int id);
    boolean insertPerson(Address person);
    boolean updatePerson(Address person);
    boolean deletePerson(Address person);
    boolean deletePerson(int id);
}
