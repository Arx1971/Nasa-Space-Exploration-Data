package com.astronaut.space.hibernate.service.serviceAPI;

import com.astronaut.space.hibernate.entity.AstronautInfo;
import com.astronaut.space.hibernate.service.serviceInterface.APIInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class API implements APIInterface {

    private SessionFactory sessionFactory;

    @Override
    public List<AstronautInfo> getAstronautInformation() {

        sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AstronautInfo.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            List<AstronautInfo> astronautInfos = session.createQuery("from AstronautInfo").getResultList();
            session.getTransaction().commit();
            session.close();
            return astronautInfos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return null;
    }
}
