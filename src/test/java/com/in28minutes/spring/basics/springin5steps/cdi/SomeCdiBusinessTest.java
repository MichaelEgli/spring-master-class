package com.in28minutes.spring.basics.springin5steps.cdi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

// Load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

    // Inject mock
    @InjectMocks
    SomeCdiBusiness business;

    @Mock
    SomeCdiDao daoMock;

    @Test
    public void testBasicScenario() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 4 });
        int actualResult = business.findGreatest();
        assertEquals(4, actualResult);
    }

    @Test
    public void testBasicScenario_Elements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] { });
        int actualResult = business.findGreatest();
        assertEquals(Integer.MIN_VALUE, actualResult);
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] { 2, 2 });
        int actualResult = business.findGreatest();
        assertEquals(2, actualResult);
    }
}
