package com.astronaut.space.hibernate.service.serviceAPI;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import com.astronaut.space.hibernate.service.serviceInterface.APIInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class API implements APIInterface {

    @Override
    public List<AstronautInfoEntity> getAstronautInformation() {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(AstronautInfoEntity.class)
                .buildSessionFactory();

        try (Session session = sessionFactory.getCurrentSession()) {
            session.beginTransaction();
            List<AstronautInfoEntity> astronautInfos = session.createQuery("from AstronautInfoEntity").getResultList();
            session.getTransaction().commit();
            session.close();
            return astronautInfos;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        return null;
    }
}
