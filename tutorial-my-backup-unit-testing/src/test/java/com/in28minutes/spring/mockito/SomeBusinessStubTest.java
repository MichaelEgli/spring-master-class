package com.in28minutes.spring.mockito;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessStubTest {
    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result = businessImpl.findTheGreatesFromaAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] { 24 , 6, 15 };
    }
}

