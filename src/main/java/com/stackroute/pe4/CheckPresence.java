package com.stackroute.pe4;

/**
 * Write a program with the implementation of Regular Expression to find the presence of the name
 * Harry in a string.
 * Input: This is Harry.
 * Output: Is Harry here ? true
 * Input : This is Henry.
 * Output: Is Harry here ? False
 */

public class CheckPresence {

    public boolean find(String inputString) {

        boolean output = false;

        /**Return true if input string has Harry else return false*/
        if (inputString.length() != 0) {
            if (inputString.matches(".*Harry*.")) {
                output = true;
            }
        }
        return output;
    }
}
