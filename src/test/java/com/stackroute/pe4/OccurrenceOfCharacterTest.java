package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrenceOfCharacterTest {
    OccurrenceOfCharacter occurrenceOfCharacter;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        occurrenceOfCharacter = new OccurrenceOfCharacter();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        occurrenceOfCharacter = null;
    }

    @Test
    public void givenCharacterAndStringShouldReturnTotalOccurrencesOfThatCharacterInString() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertEquals(10,occurrenceOfCharacter.totalOccurrence(inputString, 'a'));
    }

    @Test
    public void givenCharacterAndStringShouldReturnTotalOccurrencesOfThatCharacterInStringFailure() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertNotEquals(8,occurrenceOfCharacter.totalOccurrence(inputString, 'a'));
    }

    @Test
    public void givenEmptyStringShouldThrowUnexpected() {
        //act
        String inputString = "";
        //assert
        assertEquals(-1,occurrenceOfCharacter.totalOccurrence(inputString, 'a'));
    }

    @Test
    public void givenStringWithWhiteSpacesShouldThrowUnexpected() {
        //act
        String inputString = " ";
        //assert
        assertEquals(-1,occurrenceOfCharacter.totalOccurrence(inputString, 'a'));
    }

    @Test
    public void givenNumericStringShouldThrowUnexpected() {
        //act
        String inputString = String.valueOf(12345);
        //assert
        assertEquals(-1,occurrenceOfCharacter.totalOccurrence(inputString, 'a'));
    }

    @Test
    public void givenEmptyCharacterShouldThrowUnexpected() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertEquals(-1,occurrenceOfCharacter.totalOccurrence(inputString, ' '));
    }

    @Test
    public void givenDigitShouldThrowUnexpected() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertEquals(-1,occurrenceOfCharacter.totalOccurrence(inputString, '0'));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertEquals(null,occurrenceOfCharacter.totalOccurrence(null,'a'));
    }

}