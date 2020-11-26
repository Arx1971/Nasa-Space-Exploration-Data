package com.astronaut.space.hibernate.dao.daoInterface;

import com.astronaut.space.hibernate.entity.AstronautInfoEntity;

import java.util.List;

public interface APIInterface {

    List<AstronautInfoEntity> getAstronautInformation();

}
