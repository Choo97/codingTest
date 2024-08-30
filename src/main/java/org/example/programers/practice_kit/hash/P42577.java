package org.example.programers.practice_kit.hash;

import java.util.*;

/**
 * 전화번호 목록
 * */
public class P42577 {

    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String phone : phone_book) {
            map.put(phone, 1);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {

                if (map.containsKey(phone.substring(0, i))) {
                    return false;
                }
            }
        }

        return true; // No prefixes found, return true
    }
}
