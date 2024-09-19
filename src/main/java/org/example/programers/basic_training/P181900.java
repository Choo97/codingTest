package org.example.programers.basic_training;

import java.util.Arrays;

public class P181900 {

    public String solution(String my_string, int[] indices) {

        Arrays.sort(indices);

        StringBuffer sb = new StringBuffer(my_string);

        for (int i = 0; i < indices.length; i++) {

            sb.deleteCharAt(indices[i] - i);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcd";

        int count = 0;
        s = s.substring(0 - 1, s.length() - 1);
        System.out.println("s = " + s);
    }

}
