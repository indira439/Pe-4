package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrencesTest {

    MultipleOccurrences multipleOccurrences;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        multipleOccurrences = new MultipleOccurrences();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        multipleOccurrences = null;
    }

    @Test
    public void givenStringAndSearchWordShouldReturnMultipleOccurrencesOfSearchWordInString() {
        //act
        String inputString = "She sells seashells by the seashore";
        String expectedString = "4-6 10-12 27-29";
        //assert
        assertEquals(expectedString, multipleOccurrences.occurrence(inputString, "se"));
    }

    @Test
    public void givenStringAndSearchWordShouldReturnMultipleOccurrencesOfSearchWordInStrinh() {
        //act
        String inputString = "She sells seashells by the seashore";
        String expectedString = "4 - 6 27 –29 ";
        //assert
        assertNotEquals(expectedString, multipleOccurrences.occurrence(inputString, "se"));
    }

    @Test
    public void givenEmptyStringShouldThrowErrorMessage() {
        //act
        String inputString = "";
        //assert
        assertEquals("Text is empty", multipleOccurrences.occurrence(inputString, "se"));
    }

    @Test
    public void givenNumericStringShouldThrowErrorMessage() {
        //act
        String inputString = String.valueOf(12345);
        //assert
        assertEquals("Text contains digits", multipleOccurrences.occurrence(inputString, "a"));
    }

    @Test
    public void givenEmptyCharacterShouldThrowErrorMessage() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertEquals("Text is empty", multipleOccurrences.occurrence(inputString, " "));
    }

    @Test
    public void givenDigitShouldThrowErrorMessage() {
        //act
        String inputString = "Java is java again java again";
        //assert
        assertEquals("Text contains digits", multipleOccurrences.occurrence(inputString, "0"));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        multipleOccurrences.occurrence(null, "in");
    }
}