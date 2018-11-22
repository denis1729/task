package org.gradle;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class GreeterTest {

    private Greeter greter;

    @Before
    public void before() {
        greter = new Greeter();
    }

    //positive
    @Test
    public void canConstructAGreeterWithAName() {
        assertEquals("hello Gradle", greter.getGreeting());
    }


    @Test
    public void canConstructAGreeterWithAGenderNegative() {
        assertFalse(greter.getGreeting().equals("Hello Gradle"));
    }
}
