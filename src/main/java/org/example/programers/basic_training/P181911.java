package org.example.programers.basic_training;

public class P181911 {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < parts.length; i++) {

            String s = my_strings[i].substring(parts[i][0], parts[i][1]+1);

            buffer.append(s);
        }

        return buffer.toString();
    }
}
