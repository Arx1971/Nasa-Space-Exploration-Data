package com.astronaut.space.hibernate.application;

import com.astronaut.space.hibernate.entity.AstronautInfo;
import com.astronaut.space.hibernate.service.serviceAPI.API;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        API api = new API();

        List<AstronautInfo> astronautInfos = api.getAstronautInformation();

        System.out.println(astronautInfos);

    }

}
