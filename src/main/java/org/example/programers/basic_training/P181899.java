package org.example.programers.basic_training;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class P181899 {

    public int[] solution(int start_num, int end_num) {

        return Arrays.stream(IntStream.range(end_num, start_num+1).toArray()).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
    }
}
