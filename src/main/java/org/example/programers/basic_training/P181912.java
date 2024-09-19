package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181912 {

    public int[] solution(String[] intStrs, int k, int s, int l) {

        List<Integer> list = new ArrayList<>();
        int temp;

        for (int i = 0; i < intStrs.length; i++) {

            temp = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (k < temp) {

                list.add(temp);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

}
