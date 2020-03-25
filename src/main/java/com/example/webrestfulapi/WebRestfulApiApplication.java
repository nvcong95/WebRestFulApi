package com.example.webrestfulapi;

import com.example.webrestfulapi.edu.util.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Query;

@SpringBootApplication
public class WebRestfulApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebRestfulApiApplication.class, args);
        SessionFactory sessionFactory = ConnectionUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("From Address");
        System.out.println(query.toString());
//        session.getTransaction();
//        session.getTransaction().commit();
        session.close();
    }

}
