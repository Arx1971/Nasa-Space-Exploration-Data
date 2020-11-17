package com.astronaut.space.hibernate.application;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(AstronautInfoEntity.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            List<AstronautInfoEntity> astronautInfoEntities = session.createQuery("from AstronautInfoEntity").getResultList();
            System.out.println(astronautInfoEntities);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }

    }

}
