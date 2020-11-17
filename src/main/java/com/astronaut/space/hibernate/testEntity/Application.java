package com.astronaut.space.hibernate.testEntity;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;
import com.astronaut.space.hibernate.testEntity.AstronautInfo;
import com.astronaut.space.hibernate.service.serviceAPI.API;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        API api = new API();

        List<AstronautInfoEntity> astronautInfos = api.getAstronautInformation();

        System.out.println(astronautInfos);

    }

}