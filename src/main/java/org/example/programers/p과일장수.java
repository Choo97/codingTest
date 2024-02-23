package org.example.programers;

import java.util.Arrays;
import java.util.Collections;

public class p과일장수 {
    public static int solution(int k, int m, int[] score) {

        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));





        return 0;

    }

    public static void main(String[] args) {
        int res = solution(4, 3, new int[] {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2});
        System.out.println(res);
    }
}
