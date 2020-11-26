package com.astronaut.space.hibernate.testEntity;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import com.astronaut.space.hibernate.dao.daoApi.API;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        API api = new API();

        List<AstronautInfoEntity> astronautInfos = api.getAstronautInformation();

        System.out.println(astronautInfos);

    }

}
