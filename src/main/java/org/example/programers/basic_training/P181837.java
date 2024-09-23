package org.example.programers.basic_training;

public class P181837 {

    public int solution(String[] order) {
        int answer = 0;

        for (int i = 0; i < order.length; i++) {
            if (order[i].contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }

}
