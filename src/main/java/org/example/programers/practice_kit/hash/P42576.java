package org.example.programers.practice_kit.hash;

import java.util.*;

/**
*  완주하지 못한 선수
* */
public class P42576 {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> map = new HashMap<>();

        for (String p : participant) {
//            "Key" 와 (Integer) Value 를 맵핑 시키는데 기본값은 0 이고 하나 늘어날 떄마다 1씩 추가한다.
            map.put(p, map.getOrDefault(p, 0) + 1); //  <"String", 기본값은 0 이고 없으면 + 1>
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("[key] = " + entry.getKey() + " [value] = " + entry.getValue());
        }
        System.out.println("------------------");

        for (String c : completion) {
//            "Key" 와 (Integer) Value 를 맵핑 시키는데 Value의 값을 1씩 뺀다.
            map.put(c, map.get(c) - 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("[key] = " + entry.getKey() + " [value] = " + entry.getValue());
        }

        for (String s : map.keySet()) {
            if (map.get(s) > 0) {
                return s;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        P42576 p42576 = new P42576();

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String solution = p42576.solution(participant, completion);
        System.out.println("solution = " + solution);
    }


}
