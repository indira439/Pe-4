package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPresenceTest {
    CheckPresence checkPresence;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        checkPresence = new CheckPresence();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        checkPresence = null;
    }

    @Test
    public void givenStringContainingHarryShouldReturnTrue() {
        //act
        String string = "This is Harry";
        //assert
        assertEquals(true, checkPresence.find(string));
    }

    @Test
    public void givenStringWithoutHarryShouldReturnFalse() {
        //act
        String string = "This is Henry";
        //assert
        assertEquals(false, checkPresence.find(string));
    }

    @Test
    public void givenEmptyStringShouldReturnFalse() {
        //act
        String string = "";
        //assert
        assertEquals(false, checkPresence.find(string));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        checkPresence.find(null);
    }
}