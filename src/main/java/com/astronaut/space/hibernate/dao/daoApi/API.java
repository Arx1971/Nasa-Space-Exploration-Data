package com.astronaut.space.hibernate.dao.daoApi;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import com.astronaut.space.hibernate.dao.daoInterface.APIInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class API implements APIInterface {

    @Override
    @Transactional
    public List<AstronautInfoEntity> getAstronautInformation() {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(AstronautInfoEntity.class).buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        List<AstronautInfoEntity> astronautInfoEntities = new ArrayList<>();


        session.beginTransaction();
        Query<AstronautInfoEntity> query = session.createQuery("select c from AstronautInfoEntity c ",
                AstronautInfoEntity.class);

        astronautInfoEntities = query.getResultList();

        System.out.println(astronautInfoEntities);

        session.getTransaction().commit();

        return astronautInfoEntities;

    }
}
