package org.example.programers.basic_training;

public class P181901 {

    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int temp = 0;
        for (int i = 0; i < answer.length; i++) {
            temp += k;
            answer[i] = temp;
        }

        return answer;
    }
}
