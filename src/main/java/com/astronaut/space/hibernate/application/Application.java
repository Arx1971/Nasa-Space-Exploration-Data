package com.astronaut.space.hibernate.application;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import com.astronaut.space.hibernate.dao.daoService.API;


import java.util.List;

public class Application {

    public static void main(String[] args) {

        API api = new API();

        List<AstronautInfoEntity> astronautInfoEntities = api.getAstronautInformation();

        System.out.println(astronautInfoEntities);

    }

}
