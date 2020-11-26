package com.astronaut.space.hibernate.dao.utility;

import com.astronaut.space.hibernate.entity.*;
import com.astronaut.space.jdbc.model.AstronautChildInfo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class HibernateUtility {

    /*public static Session getCurrentSession() {
        // Hibernate 5.4 SessionFactory example without XML
        Map<String, String> settings = new HashMap<>();
        settings.put("connection.driver_class", "com.mysql.jdbc.Driver");
        settings.put("dialect", "org.hibernate.dialect.MySQL8Dialect");
        settings.put("hibernate.connection.url",
                "jdbc:mysql://localhost:3306/nasa_space_exploration_database?useSSL=false&amp;serverTimezone=UTC");
        settings.put("hibernate.connection.username", "root");
        settings.put("hibernate.connection.password", "root");
        settings.put("hibernate.current_session_context_class", "thread");
        settings.put("hibernate.show_sql", "true");
        settings.put("hibernate.format_sql", "true");

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(settings).build();

        MetadataSources metadataSources = new MetadataSources(serviceRegistry);
        metadataSources.
                addAnnotatedClass(AstronautInfoEntity.class).
                addAnnotatedClass(AstronautChildInfo.class).
                addAnnotatedClass(AstronautEducationInfoEntity.class).
                addAnnotatedClass(AstronautSpouseInfoEntity.class).
                addAnnotatedClass(DegreeInfoEntity.class).
                addAnnotatedClass(MissionDetailsEntity.class).
                addAnnotatedClass(MissionInfoEntity.class).
                addAnnotatedClass(MissionLandInfoEntity.class).
                addAnnotatedClass(MissionLaunchInfoEntity.class).
                addAnnotatedClass(MissionObjectiveInfoEntity.class).
                addAnnotatedClass(MissionLandingSiteEntity.class).
                addAnnotatedClass(UniversityInfoEntity.class).
                addAnnotatedClass(SpaceShipInfoEntity.class).
                addAnnotatedClass(MissionDetailsEntity.class);


        Metadata metadata = metadataSources.buildMetadata();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();

        return sessionFactory.getCurrentSession();
    }*/

}
