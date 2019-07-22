package com.stackroute.pe4;

/**
 * Write a program that sets up a String variable containing a paragraph of text of your choice.
 * a. Extract the words from the text and sort them into alphabetical order.
 * b. Display the sorted list of words.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortWords {

    public List<String> sort(String inputString) {

        /**Check if inputString is empty or not*/
        if (inputString.length() == 0) {
            return Collections.singletonList("Text is empty");
        }

        /**If input is a numeric string throw error message*/
        if (inputString.matches("[0-9]*")) {
            return Collections.singletonList("Text contains digits");
        }

        /**Sort the words in alphabetic order and return the sorted output*/
        ArrayList<String> output = new ArrayList<String>(Arrays.asList(inputString.split(" ")));
        Collections.sort(output);
        return output;

    }
}

