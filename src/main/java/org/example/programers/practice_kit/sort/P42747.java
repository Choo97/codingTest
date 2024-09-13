package org.example.programers.practice_kit.sort;

import java.util.Arrays;

/**
 * H-Index
 * */
public class P42747 {

    public int solution(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for(int i = citations.length - 1; i >= 0; i--) {
            int h = Math.min(citations[i], citations.length - i);
            hIndex = Math.max(hIndex, h);
        }
        return hIndex;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        P42747 p42747 = new P42747();

        System.out.println("p42747 = " + p42747.solution(citations));
    }
}
