package org.example.programers.basic_training;

public class P181908 {

    public int solution(String my_string, String is_suffix) {
        if (my_string.endsWith(is_suffix)) {
            return 1;
        }
        return 0;
    }
}
