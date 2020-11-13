package com.astronaut.space.jdbc.API.apiInterface;

import com.astronaut.space.jdbc.model.Astronaut;
import com.astronaut.space.jdbc.model.AstronautChildInfo;

import java.util.List;

public interface ApiInterface {

    public List<Astronaut> getAllAstronauts();

    public List<AstronautChildInfo> getAstronautChildById(int id);

    public List<Astronaut> getAllAstronautsEductionDetails();

    public List<Object[]> getAstronautMissionMileageInformation();
}
