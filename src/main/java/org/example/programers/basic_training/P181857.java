package org.example.programers.basic_training;

import java.util.Arrays;

public class P181857 {

    public int[] solution(int[] arr) {
        int arrLength = arr.length;

        int twoPow = 1;

        while (twoPow < arrLength) {
            twoPow *= 2;
        }

        if (twoPow == arrLength) {
            return arr;
        }

        int[] result = Arrays.copyOf(arr, twoPow);
        return result;
    }


}
