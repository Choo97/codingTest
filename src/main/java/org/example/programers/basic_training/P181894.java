package org.example.programers.basic_training;

import java.util.Arrays;

public class P181894 {

    public int[] solution(int[] arr) {

        int firstTwo = 0, lastTwo = 11;
        boolean isEmpty = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstTwo = i;
                isEmpty = false;
                break;
            }
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == 2) {
                lastTwo = i + 1;
                break;
            }
        }

        if (isEmpty == false) {
            return Arrays.copyOfRange(arr, firstTwo, lastTwo);
        }

        return new int[]{-1};
    }

}
