package org.example.programers.basic_training;

public class P181840 {

    public int solution(int[] num_list, int n) {

        for (int i : num_list) {
            if (i == n) return 1;
        }

        return 0;
    }
}
