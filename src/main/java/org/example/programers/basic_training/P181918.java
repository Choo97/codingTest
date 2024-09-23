package org.example.programers.basic_training;

import java.util.ArrayDeque;
import java.util.Arrays;

public class P181918 {

    public int[] solution(int[] arr) {
        int[] stk = {};
        ArrayDeque<Integer> que = new ArrayDeque<>();
        int i = 0;

        while (i < arr.length) {
            if (que.isEmpty()) {
                que.add(arr[i]);
                i++;
            } else if (que.peekLast() < arr[i]) {
                que.add(arr[i]);
                i++;
            } else {
                que.removeLast();
            }
        }

        if (que.isEmpty()) {
            return new int[0];
        }

        stk = new int[que.size()];

        for (int j = 0; j < stk.length; j++) {
            stk[j] = que.removeFirst();
        }
        return stk;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};

        P181918 p181918 = new P181918();
        int[] solution = p181918.solution(arr);

        for (int i : solution) {
            System.out.println("i = " + i);
        }

    }

}
