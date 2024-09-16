package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181888 {

    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i += n) {
            list.add(num_list[i]);
        }

        int size = list.size();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }
}
