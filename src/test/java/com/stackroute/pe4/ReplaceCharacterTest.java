package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharacterTest {
    ReplaceCharacter replaceCharacter;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        replaceCharacter = new ReplaceCharacter();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        replaceCharacter = null;
    }

    @Test
    public void givenStringShouldReturnReplacedString()
    {
        //act
        String expectedResult = "faity fry";
        //assert
        assertEquals(expectedResult,replaceCharacter.replaceCharacter("daily dry"));
    }

    @Test
    public void givenStringShouldReturnReplacedStringFailure()
    {
        //act
        String expectedResult = "daily fry";
        //assert
        assertNotEquals(expectedResult,replaceCharacter.replaceCharacter("daily dry"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException()
    {
        assertEquals(null,replaceCharacter.replaceCharacter(null));

    }

    @Test
    public void givenNumericStringShouldReturnErrorMessage()
    {
        assertEquals("Give valid string",replaceCharacter.replaceCharacter("1234"));

    }

    @Test
    public void givenEmptyStringShouldReturnErrorMessage()
    {
        //act
        String string = "";
        assertEquals("Give valid string",replaceCharacter.replaceCharacter(string));

    }

    @Test
    public void givenStringWithoutDorIShouldReturnErrorMessage()
    {
        //act
        String expectedString = "String doesn't contains d or i";
        String string = "REPLACE";
        //assert
        assertEquals(expectedString,replaceCharacter.replaceCharacter(string));

    }

}