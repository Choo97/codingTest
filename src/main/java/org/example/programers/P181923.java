package org.example.programers;

import java.util.Arrays;

public class P181923 {

    public int[] solution(int[] arr, int[][] queries) {

        int qurLng2degree = queries.length;
        int arrLng = arr.length;
        int[] answer = new int[qurLng2degree];

        for (int i = 0; i < qurLng2degree; i++) { // queries의 길이만큼 n번 반복해야함

            for (int j = 0; j < arrLng; j++) { // arr의 길이만큼 m번 반복해야함

                if (arr[j] >= queries[i][0] && arr[j] <= queries[i][1]) { //

                    if (queries[i][2] < arr[j]) {
                        answer[i] = j;
                        break;
                    }

                    answer[i] = -1;

                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        P181923 p181923 = new P181923();

        int[] arr = {0,1,2,4,3};
        int[][] queries = {
                {0, 4, 2},
                {0,3,2},
                {0,2,2}
        };


        int[] ints = p181923.solution(arr, queries);

        System.out.println(Arrays.toString(ints));
    }

}
