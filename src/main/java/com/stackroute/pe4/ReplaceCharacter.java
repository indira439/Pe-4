package com.stackroute.pe4;

/**
 * Write a program to replace all d with f and all l with t in the given String
 * Input: daily dry
 * Output: faity fry
 * Original string: daily dry
 * New String: faity fry
 */
public class ReplaceCharacter {

    public String replaceCharacter(String inputString) {

        /**Check if inputString is empty or contains digits*/
        if (inputString.length() != 0 && !(inputString.matches("[0-9]*"))) {
            if (inputString.contains("i")) {
                /**Replace d with f and i with t*/
                String tempString = inputString.replaceAll("[d]", "f");
                String outputString = tempString.replaceAll("[l]", "t");
                /**Return the replaced string*/
                return outputString;
            } else {
                return "String doesn't contains d or i";
            }
        } else {
            /**Throw error message if inputString is empty or in invalid format*/
            return "Give valid string";
        }
    }
}
