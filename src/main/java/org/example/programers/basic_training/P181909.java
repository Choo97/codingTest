package org.example.programers.basic_training;

import java.util.Arrays;

public class P181909 {

    public String[] solution(String my_string) {
        int strL = my_string.length();
        String[] answer = new String[strL];
        for (int i = 0; i < strL; i++) {
            answer[i] = my_string.substring(i);
        }

        Arrays.sort(answer);

        for (String s : answer) {
            System.out.println("s = " + s);
        }
        return answer;
    }
}
