package org.example.programers.basic_training;

import java.util.ArrayList;

public class P181836 {

    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < k; j++) {
                list.add(upScalingToK(picture[i], k));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public String upScalingToK(String string, int k) {
        if (k == 1) {
            return string;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            sb.append(String.valueOf(string.charAt(i)).repeat(Math.max(0, k)));
        }

        return sb.toString();
    }

}
