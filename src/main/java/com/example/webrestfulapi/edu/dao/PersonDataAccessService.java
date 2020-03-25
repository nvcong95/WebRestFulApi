package com.example.webrestfulapi.edu.dao;

import com.example.webrestfulapi.edu.model.Address;
import com.example.webrestfulapi.edu.model.Person;
import com.example.webrestfulapi.edu.util.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonDataAccessService implements PersonDAO {
    private List<Person> DB = new ArrayList<>();

    @Override
    public List<Person> getAllPerson() {
        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.getTransaction().commit();
            String sql = "FROM Person";
            Query query = session.createQuery(sql);
            DB = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ConnectionUtil.getSessionFactory().close();
        return DB;
    }

    @Override
    public List<Person> findByName(String name) {
        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.getTransaction().commit();
            String sql = "FROM Person WHERE Person.name = :name";
            Query query = session.createQuery(sql);
            DB = query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ConnectionUtil.getSessionFactory().close();
        return DB;
    }

    @Override
    public Person findbyId(int id) {
        Person person = new Person();

        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            session.getTransaction();
            String sql = "FROM Person WHERE Person.id = :id";
            Query query = session.createQuery(sql);
            person = (Person) query.getSingleResult();

        } catch (Exception e) {
            e.printStackTrace();
        }
        ConnectionUtil.getSessionFactory().close();
        return person;
    }
    @Override
    public boolean insertPerson(Person person) {
        Address address = new Address(person.getAddress().getName(), person.getAddress().getCity());
        Person tempPerson = new Person(person.getName(), address);
        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        try {
            Session session = sessionFactory.openSession();
            session.getTransaction();
            session.save(address);
            session.save(tempPerson);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean updatePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(Person person) {
        return false;
    }

    @Override
    public boolean deletePerson(int id) {
        return false;
    }


}
