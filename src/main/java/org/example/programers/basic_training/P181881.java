package org.example.programers.basic_training;

import java.util.Arrays;

public class P181881 {

    public int solution(int[] arr) {
        int answer = 0;
        int[] tempArr = Arrays.copyOf(arr, arr.length);
        boolean isEquals = true;

        while (isEquals) {
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    tempArr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    tempArr[i] = arr[i] * 2 + 1;
                }
            }

            if (Arrays.equals(arr, tempArr)) {
                return answer;
            }
            arr = Arrays.copyOf(tempArr, tempArr.length);
            answer++;
        }

        return 0;
    }

}
