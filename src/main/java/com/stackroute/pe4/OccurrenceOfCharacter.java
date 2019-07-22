package com.stackroute.pe4;

/**
 * Write a java program to count the total number of occurrences of a given character in a string
 * without using any loop?
 * For Example- Java is java again java again count number of occurrence of a in the given string
 */

public class OccurrenceOfCharacter {

    public int totalOccurrence(String inputString, char inputCharacter) {

        /**Check for empty string*/
        if (inputString.isEmpty() || inputString.matches(" ") || inputCharacter == ' ') {
            return -1;
        }

        /**Check for string containing digits*/
        if (inputString.matches("[0-9]*") || String.valueOf(inputCharacter).matches("[0-9]")) {
            return -1;
        }

        int count;
        /**Replace the character to be searched with empty string and store it in tempString*/
        String tempString = inputString.replaceAll(String.valueOf(inputCharacter), "");
        /**Required count will be difference of lengths of inputString and tempString*/
        count = inputString.length() - tempString.length();
        return count;
    }
}
