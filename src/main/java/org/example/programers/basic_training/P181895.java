package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181895 {

    public int[] solution(int[] arr, int[][] intervals) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }

}
