package com.in28minutes.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCdiDao {

    public int [] getData() {
        // does illustrate data which would typically come from the database
        return new int [] { 5, 89, 100 };
    }
}
