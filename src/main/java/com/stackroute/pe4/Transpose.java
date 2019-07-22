package com.stackroute.pe4;

/**
 * Write a program to transpose the given string.
 * Input String : a quick brown fox jumps over the lazy dog
 * Output String: a kciuq nworb xof spmuj revo eht yzal god
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Transpose {

    public String transposeString(String inputString) {

        if (inputString.length() == 0) {
            return "Text is empty";
        }

        if (inputString.matches("[0-9]*")) {
            return "Text contains digits";
        }

        String[] tempString = inputString.split(" ");
        String outputString = "";

        for (int i = 0; i < tempString.length; i++) {
            List<String> string = Arrays.asList(tempString[i].split(""));
            Collections.reverse(string);
            outputString = outputString + String.join("", string) + " ";
        }
        return outputString.trim();
    }

}

