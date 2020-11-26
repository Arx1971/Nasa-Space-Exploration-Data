package com.astronaut.space.hibernate.dao.daoApi;

import com.astronaut.space.hibernate.entity.AstronautChildInfoEntity;
import com.astronaut.space.hibernate.entity.AstronautEducationInfoEntity;
import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import com.astronaut.space.hibernate.dao.daoInterface.APIInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class API implements APIInterface {

    @Override
    public List<AstronautInfoEntity> getAstronautInformation() {

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
        return null;
    }

    @Override
    public AstronautInfoEntity getAstronautInformation(Integer id) {
        return null;
    }
}
