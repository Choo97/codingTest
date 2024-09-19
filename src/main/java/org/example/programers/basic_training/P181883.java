package org.example.programers.basic_training;

public class P181883 {

    public int[] solution(int[] arr, int[][] queries) {

        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
                arr[j]++;
            }

        }
        return arr;
    }

}
