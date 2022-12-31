package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SomeCdiBusiness {

    @Autowired
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCDIDAO() {
        return someCdiDao;
    }

    public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
        this.someCdiDao = someCdiDao;
    }
}
