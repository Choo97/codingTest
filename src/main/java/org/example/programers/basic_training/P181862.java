package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181862 {

    public String[] solution(String myStr) {
        String[] split = myStr.split("[a-c]");

        if (split.length == 0) {
            String[] isEmpty = {"EMPTY"};
            return isEmpty;
        }

        List<String> list = new ArrayList<>();
        for (String s : split) {
            if (!s.equals("")) {
                list.add(s);
            }
        }

        int size = list.size();
        String[] answer = new String[size];

        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
