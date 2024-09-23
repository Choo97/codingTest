package org.example.programers.basic_training;

public class P181903 {

    public String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }

}
