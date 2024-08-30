package org.example.programers.practice_kit.sort;

import java.util.Arrays;

/**
 * 가장 큰 수
 * */
public class P42746 {

    /*
    * 정수를 이어붙여서 만들 수 있는 수 중에서 제일 큰 수를 반환
    * */
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {

        P42746 p42746 = new P42746();

        int[] numbers = {3, 30, 34, 5, 9};

        p42746.solution(numbers);
    }
}
