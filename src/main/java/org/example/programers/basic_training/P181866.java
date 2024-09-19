package org.example.programers.basic_training;

import java.util.Arrays;

public class P181866 {

    public String[] solution(String myString) {
        String[] xes = myString.split("x");

        Arrays.sort(xes, (o1, o2) -> o1.compareTo(o2));

        return xes;
    }

}
