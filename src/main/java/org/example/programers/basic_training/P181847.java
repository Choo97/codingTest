package org.example.programers.basic_training;

public class P181847 {

    public String solution(String n_str) {
        int count = 0;

        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.startsWith("0", i)) {
                count++;
            } else {
                break;
            }
        }

        return n_str.substring(count);
    }

}
