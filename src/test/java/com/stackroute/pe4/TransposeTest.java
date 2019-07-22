package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {

    Transpose transpose;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        transpose = new Transpose();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        transpose = null;
    }

    @Test
    public void givenStringShouldReturnTransposeOfTheString() {
        //act
        String string = "a quick brown fox jumps over the lazy dog";
        String expectedResult = "a kciuq nworb xof spmuj revo eht yzal god";
        //assert
        assertEquals(expectedResult,transpose.transposeString(string));
    }

    @Test
    public void givenStringShouldReturnTransposeOfTheStringFailure() {
        //act
        String string = "a quick brown fox jumps over the lazy dog";
        String expectedResult = "nworb xof spmuj revo eht yzal god";
        //assert
        assertNotEquals(expectedResult,transpose.transposeString(string));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowException() {
        //assert
        assertEquals("",transpose.transposeString(null));
    }

    @Test
    public void givenEmptyTextShouldReturnErrorMessage() {
        //act
        String string = "";
        //assert
        assertEquals("Text is empty",transpose.transposeString(string));
    }

    @Test
    public void givenDigitsShouldReturnErrorMessage() {
        //act
        String string = "123";
        //assert
        assertEquals("Text contains digits",transpose.transposeString(string));
    }
}