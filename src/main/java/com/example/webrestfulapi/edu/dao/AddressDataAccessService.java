package com.example.webrestfulapi.edu.dao;

import com.example.webrestfulapi.edu.model.Address;
import com.example.webrestfulapi.edu.model.Person;
import com.example.webrestfulapi.edu.util.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;
@Repository
public class AddressDataAccessService implements AddressDAO {
    @Override
    public List<Address> getAllAddress() {
        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            Query query = session.createQuery("FROM Address");

        } catch (Exception e) {

        }
        return null;
    }

    @Override
    public List<Address> findByCity(String city) {
        return null;
    }

    @Override
    public List<Address> findByName(String name) {
        return null;
    }

    @Override
    public Person findbyId(int id) {
        return null;
    }

    @Override
    public boolean insertPerson(Address person) {
        return false;
    }

    @Override
    public boolean updatePerson(Address person) {
        return false;
    }

    @Override
    public boolean deletePerson(Address person) {
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        return false;
    }
}
