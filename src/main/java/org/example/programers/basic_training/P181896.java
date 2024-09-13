package org.example.programers.basic_training;

import java.util.Arrays;
import java.util.stream.IntStream;

public class P181896 {

    public int solution(int[] num_list) {

        for (int i = 0; i < num_list.length; i++) {
            if ( num_list[i] < 0) return i;
        }

        return -1;
    }
}
