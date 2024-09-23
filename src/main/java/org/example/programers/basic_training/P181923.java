package org.example.programers.basic_training;

import java.util.Arrays;

public class P181923 {

    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int[] temp;
        int s, e, k;

        for (int i = 0; i < queries.length; i++) {
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];

            temp = Arrays.copyOfRange(arr, s, e + 1);
            Arrays.sort(temp);
            answer[i] = nearLargeNum(temp, k);
        }
        return answer;
    }

    int nearLargeNum(int[] arr, int k) {
        int answer = Integer.MAX_VALUE;
        boolean found = false;

        for (int num : arr) {
            if (num > k) {
                if (num < answer) {
                    answer = num;
                    found = true;
                }
            }
        }

        return found ? answer : -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {
                {0, 4, 2},
                {0, 3, 2},
                {0, 2, 2}};

        P181923 p181923 = new P181923();

        p181923.solution(arr, queries);
    }

}
