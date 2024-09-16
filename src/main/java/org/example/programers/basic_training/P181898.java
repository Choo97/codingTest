package org.example.programers.basic_training;

public class P181898 {

    public int solution(int[] arr, int idx) {

        for (int i = idx; i < arr.length; i++) {

            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }

}
