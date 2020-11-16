package com.astronaut.space.hibernate.service.serviceAPI;

import com.astronaut.space.hibernate.entity.AstronautInfo;
import com.astronaut.space.hibernate.service.serviceInterface.APIInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class API implements APIInterface {

    @Override
    public List<AstronautInfo> getAstronautInformation() {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AstronautInfo.class)
                .buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();
            List<AstronautInfo> astronautInfos = session.createQuery("from AstronautInfo").getResultList();
            session.getTransaction().commit();
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
