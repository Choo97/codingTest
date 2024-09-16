package org.example.programers.basic_training;

public class P181878 {

    public int solution(String myString, String pat) {

        if (myString.toLowerCase().contains(pat.toLowerCase())) {
            return 1;
        }

        return 0;
    }

}
