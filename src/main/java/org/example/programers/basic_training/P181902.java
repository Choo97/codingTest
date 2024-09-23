package org.example.programers.basic_training;

public class P181902 {

    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if (c >= 91) {
                answer[c - 71]++;
            } else {
                answer[c - 65]++;
            }
        }
        return answer;
    }
}

