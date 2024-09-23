package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P181859 {

    /*
     * i 의 초가값은 0 이고, i가 arr의 길이보다 작으면 아래를 반복
     * ---------------------------------------------------
     * - stk 가 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더함
     *
     * - stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
     *
     * - stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
     * */
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int length = arr.length;
        for (int i = 0; i < length; i++) {

            if (list.isEmpty()) {
                list.add(arr[i]);
            } else if (arr[i] == list.get(list.size()-1)) {
                list.remove(list.size()-1);
            } else if (arr[i] != list.get(list.size()-1)) {
                list.add(arr[i]);
            }

        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int[] solution2(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int no : arr) {
            if (!stack.isEmpty() && no == stack.peek()) {
                stack.pop();
            } else {
                stack.push(no);
            }
        }

        return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        P181859 p181859 = new P181859();

        int[] arr = {0, 1, 1, 1, 0};
        int[] result = {0, 1, 0};
        p181859.solution(arr);
    }
}
