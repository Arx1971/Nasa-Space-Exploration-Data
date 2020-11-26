package com.astronaut.space.hibernate.dao.daoInterface;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;

import java.util.List;

public interface APIInterface {

    /*Return all Astronaut from the Database table*/
    List<AstronautInfoEntity> getAstronautInformation();

    /*Given Astronaut ID, return all Astronaut Information*/

    public AstronautInfoEntity getAstronautInformation(Integer id);

}
