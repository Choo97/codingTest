package org.example.programers.basic_training;

import java.util.HashMap;

public class P181855 {

    public int solution(String[] strArr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < strArr.length; i++) {
            map.put(strArr[i].length(), map.getOrDefault(strArr[i].length(), 0) + 1);
        }

        for (Integer value : map.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

}
