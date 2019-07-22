package com.stackroute.pe4;

/**
 * Write a program to find out the multiple occurrences of the given word in a string using Matcher
 * methods.
 * Input : She sells seashells by the seashore
 * Given word: se
 * Output :
 * Found at: 4 - 6
 * Found at: 10 - 12
 * Found at: 27 – 29
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences {

    public String occurrence(String inputString, String searchElement) {

        /**Check for empty string*/
        if (inputString.isEmpty() || inputString.matches(" ") || searchElement == " ") {
            return "Text is empty";
        }

        /**Check for string containing digits*/
        if (inputString.matches("[0-9]*") || String.valueOf(searchElement).matches("[0-9]")) {
            return "Text contains digits";
        }

        /**Create a pattern to be searched*/
        Pattern pattern = Pattern.compile(searchElement);

        /**Search for above pattern*/
        Matcher matcher = pattern.matcher(inputString);

        String output = "";

        /**Print starting and ending indexes of the pattern in text */
        while (matcher.find()) {
            output = output + matcher.start() + "-" + matcher.end() + " ";
        }
        return output.trim();

    }
}
