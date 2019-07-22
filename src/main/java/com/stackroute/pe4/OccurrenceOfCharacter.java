package com.stackroute.pe4;

public class OccurrenceOfCharacter {

    public int totalOccurrence(String inputString, char inputCharacter) {

        if(inputString.isEmpty() || inputString.matches(" ") || inputCharacter == ' ') {
            return -1;
        }

        if(inputString.matches("[0-9]*") || String.valueOf(inputCharacter).matches("[0-9]")) {
            return -1;
        }

        int count;
        String tempString = inputString.replaceAll(String.valueOf(inputCharacter),"");
        count = inputString.length()-tempString.length();
        return count;
    }
}
