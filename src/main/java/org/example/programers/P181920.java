package org.example.programers;

import java.util.ArrayList;
import java.util.List;

public class P181920 {
    public int[] solution(int start_num, int end_num) {

        List<Integer> list = new ArrayList<>();

        for (int i = start_num; i < end_num+1; i++) {
            list.add(i);
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
