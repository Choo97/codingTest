package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181844 {

    public int[] solution(int[] arr, int[] delete_list) {

        List<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }

        for (int i : delete_list) {
            int idx = list.indexOf(i);
            if (idx != -1) {
                list.remove(idx);
            }
        }

        int[] intArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            intArray[i] = list.get(i); // 각각의 Integer를 int로 변환
        }
//        int count = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < delete_list.length; j++) {
//                if (arr[i] == delete_list[j]) {
//                    arr[i] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                count++;
//            }
//        }
//
//        int[] result = new int[count];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != 0) {
//                result[i] = arr[i];
//            }
//        }

        return null;
    }
}
