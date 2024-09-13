package org.example.programers.basic_training;

public class P181835 {

    public int[] solution(int[] arr, int k) {

        if (k % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * k;
            }
        }

        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
        }

        return arr;
    }
}
