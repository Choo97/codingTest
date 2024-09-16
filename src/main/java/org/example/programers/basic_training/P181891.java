package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181891 {

    public int[] solution(int[] num_list, int n) {
        int length = num_list.length;
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[length];
        for (int i = n; i < length; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }

        for (int i = 0; i < length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
