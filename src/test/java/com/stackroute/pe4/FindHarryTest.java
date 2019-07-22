package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindHarryTest {
    FindHarry findHarry;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        findHarry = new FindHarry();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        findHarry = null;
    }

    @Test
    public void givenStringShouldReturnTrue() {
        //act
        String string = "This is Harry";
        //assert
        assertEquals(true,findHarry.find(string));
    }

    @Test
    public void givenStringShouldReturnFalse() {
        //act
        String string = "This is Henry";
        //assert
        assertEquals(false,findHarry.find(string));
    }

    @Test
    public void givenEmptyTextShouldReturnFalse() {
        //act
        String string = "";
        //assert
        assertEquals(false,findHarry.find(string));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowException() {
        findHarry.find(null);
    }
}