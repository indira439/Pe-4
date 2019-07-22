package com.stackroute.pe4;

public class ReplaceCharacter {

    public String replaceCharacter(String inputString) {

        if (inputString.length() != 0 && !(inputString.matches("[0-9]*"))) {
            if (inputString.contains("i")) {
                String tempString = inputString.replaceAll("[d]", "f");
                String outputString = tempString.replaceAll("[l]", "t");
                return outputString;
            } else {
                return "String doesn't contains d or i";
            }
        } else {
            return "Give valid string";
        }
    }
}
