package org.example.programers.basic_training;

public class P181910 {

    public String solution(String my_string, int n) {
        int length = my_string.length();
        return my_string.substring(length-n, length);
    }
}
