package org.example.programers.practice_kit.stack_Que;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class P12906 {


    public int[] solution(int []arr) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        int temp = -1;

        for (int i : arr) {
            if (!(temp == i)) {
                deque.add(i);
                temp = i;
            }
        }
        Integer[] array = new Integer[deque.size()];
        array = deque.toArray(array);

        return Arrays.stream(array).mapToInt(value -> value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        P12906 p12906 = new P12906();
        int[] solution = p12906.solution(arr);

        for (int s : solution) {
            System.out.println("s = " + s);
        }

    }
}
