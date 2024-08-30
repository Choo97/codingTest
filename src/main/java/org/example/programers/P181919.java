package org.example.programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181919 {

    public int[] solution(int n) {

        List<Integer> list = new ArrayList<>();

        list.add(n);

        while(n != 1) {

            if (n == 1) { // 1남았을 때
                list.add(n);
                break;
            }

            if (n % 2 == 0) { // 짝수 일 때
                list.add(n / 2);
                n = n / 2;
            }

            if (n % 2 == 1 && n != 1) { // 홀수 일 때
                list.add(3 * n + 1);
                n = 3 * n + 1;
            }
        }
        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }

    public static void main(String[] args) {
        P181919 p181919 = new P181919();

        int[] solution = p181919.solution(10);

        for (int i : solution
        ) {
            System.out.println(i);
        }


    }



}
