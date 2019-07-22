package com.stackroute.pe4;

public class FindHarry {

    public boolean find(String inputString) {

        boolean output = false;

        if (inputString.length() != 0) {
            if (inputString.matches(".*Harry*.")) {
                output = true;
            }
        }
        return output;
    }
}
