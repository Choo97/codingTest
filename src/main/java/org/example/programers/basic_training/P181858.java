package org.example.programers.basic_training;

import java.util.*;

public class P181858 {

    public int[] solution(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[k];

        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }

        if (list.size() == k) {
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
        } else {
            for (int i = 0; i < k; i++) {
                if (i < list.size()) {
                    answer[i] = list.get(i);
                } else {
                    answer[i] = -1;
                }
            }
        }

        return answer;
    }

}
