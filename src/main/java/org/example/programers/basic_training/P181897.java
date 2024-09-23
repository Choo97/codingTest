package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181897 {

    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();

        if (n == 1) {

            for (int i = 0; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {

            for (int i = slicer[0]; i < num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {

            for (int i = slicer[0]; i <= slicer[1]; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 4) {

            for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                list.add(num_list[i]);
            }
        }

        int size = list.size();
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

}
