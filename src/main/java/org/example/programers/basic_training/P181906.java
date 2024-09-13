package org.example.programers.basic_training;

public class P181906 {

    public int solution(String my_string, String is_prefix) {
        if (my_string.startsWith(is_prefix)) {
            return 1;
        }
        return 0;
    }
}
