package org.example.programers.basic_training;

import java.util.Arrays;
import java.util.stream.Stream;

public class P181879 {

    /*
     * 정수가 담긴 리스트 num_list가 주어질 때, 리스트의 길이가 11 이상이면 리스트에 있는 모든 원소의 합을 10 이하이면 모든 원소의 곱을 return하도록 solution 함수를 완성해주세요.
     * */

    public int solution(int[] num_list) {

        if (num_list.length >= 11) {
            return Arrays.stream(num_list).sum();
        }

        if (num_list.length <= 10) {
            return Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
        }

        return 0;
    }

    public static void main(String[] args) {
        P181879 p181879 = new P181879();
//        int[] arr = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] arr = {2,3,4,5};
        int solution = p181879.solution(arr);
        System.out.println("solution = " + solution);
    }
}
