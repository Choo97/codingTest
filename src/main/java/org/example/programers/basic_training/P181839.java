package org.example.programers.basic_training;

public class P181839 {
    public int solution(int a, int b) {

        if (a % 2 == 1 && b % 2 == 1) {
            return (int) (Math.pow((double) a, 2) + Math.pow((double) b, 2));
        }

        if ((a + b) % 2 == 1) {
            return 2 * (a + b);
        }

        return Math.abs(a - b);
    }
}
