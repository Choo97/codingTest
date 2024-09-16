package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181870 {

    public String[] solution(String[] strArr) {

        List<String> list = new ArrayList<>();

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                list.add(strArr[i]);
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
