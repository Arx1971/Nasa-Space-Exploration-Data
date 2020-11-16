package com.astronaut.space.jdbc.application;

import com.astronaut.space.jdbc.API.apiImplementaion.ServiceApi;
import com.astronaut.space.jdbc.model.Astronaut;
import com.astronaut.space.jdbc.model.AstronautChildInfo;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ServiceApi serviceApi = new ServiceApi();

        List<AstronautChildInfo> astronautChildInfos = serviceApi.getAstronautChildById(9);

        System.out.println(astronautChildInfos);

        List<Astronaut> astronauts = serviceApi.getAllAstronauts();

        System.out.println(astronauts);

        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getAstronautChildInfos());
        }

        List<Astronaut> astronauts1 = serviceApi.getAllAstronautsEductionDetails();

        for (Astronaut astronaut : astronauts1) {
            System.out.println(astronaut);
        }

    }

}
