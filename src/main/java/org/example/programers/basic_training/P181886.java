package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181886 {

    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < names.length; i += 5) {
            list.add(names[i]);
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P181886 p181886 = new P181886();

        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

        String[] solution = p181886.solution(names);

        for (String name : solution) {
            System.out.println("name = " + name);
        }
    }

}
