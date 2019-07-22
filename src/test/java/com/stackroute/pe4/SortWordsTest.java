package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class SortWordsTest {

    SortWords sortWords;

    /**Creates object before every test case*/
    @Before
    public void setUp() {
        sortWords = new SortWords();
    }

    /**Clears the initialization after every test case*/
    @After
    public void tearDown() {
        sortWords = null;
    }

    @Test
    public void givenTextShouldReturnWordsInAlphabeticOrder() {
        //act
        String string = "java is a programming language";
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("a");
        expectedResult.add("is");
        expectedResult.add("java");
        expectedResult.add("language");
        expectedResult.add("programming");
        //assert
        assertEquals(expectedResult,sortWords.sort(string));
    }

    @Test
    public void givenTextShouldReturnWordsInAlphabeticOrderFailure() {
        //act
        String string = "Java is a programming language";
        //assert
        assertNotEquals("Java is a language programming",sortWords.sort(string));
    }

    @Test
    public void givenEmptyTextShouldReturnErrorMessage() {
        //act
        String string = "";
        List<String> expectedResult = new ArrayList<>();
        expectedResult = Collections.singletonList("Text is empty");
        //assert
        assertEquals(expectedResult,sortWords.sort(string));
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowException() {
        //assert
        assertEquals("Text is empty",sortWords.sort(null));
    }

    @Test
    public void givenDigitsShouldReturnErrorMessage() {
        //act
        String string = "123";
        List<String> expectedResult = new ArrayList<>();
        expectedResult = Collections.singletonList("Text contains digits");
        //assert
        assertEquals(expectedResult,sortWords.sort(string));
    }
}