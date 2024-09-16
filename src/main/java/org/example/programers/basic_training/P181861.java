package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181861 {

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0 ; i < list.size() ; i++)
            answer[i] = list.get(i).intValue();

        return answer;
    }

}