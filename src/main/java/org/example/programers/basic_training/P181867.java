package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P181867 {

    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();

        String[] xes = myString.split("x");

        for (int i = 0; i < xes.length; i++) {
            list.add(xes[i].length());
        }

        if (myString.lastIndexOf("x")+1 == myString.length()) {
            list.add(list.size(), 0);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }

        return answer;
    }

    public static void main(String[] args) {

        P181867 p181867 = new P181867();

        String myString = "oxooxoxxox";

        int[] solution = p181867.solution(myString);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

}
