package org.example.programers.basic_training;

public class P181872 {

    public String solution(String myString, String pat) {

        return myString.substring(0, myString.lastIndexOf(pat)) + pat;
    }

}
