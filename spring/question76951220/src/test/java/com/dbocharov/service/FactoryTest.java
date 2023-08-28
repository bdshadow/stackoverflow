package com.dbocharov.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FactoryTest {

    @Mock(name = "childClass")
    private ChildClass childClass;

    @Mock(name = "parentClass")
    private ParentClass parentClass;

    private Factory factory;

    @Before
    public void init() {
        factory = new Factory(parentClass, childClass);
    }
    @Test
    public void getObjectTest() {
        assertEquals(parentClass, factory.getObject(true));
        assertEquals(childClass, factory.getObject(false));

    }
}