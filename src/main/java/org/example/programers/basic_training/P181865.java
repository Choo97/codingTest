package org.example.programers.basic_training;

public class P181865 {

    public int solution(String binomial) {
        String[] split = binomial.split(" ");

        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[2]);

        if (split[1].equals("+")) {

            return a + b;
        }else if (split[1].equals("-")) {

            return a - b;
        } else if (split[1].equals("*")) {

            return a * b;
        }
        return 0;
    }

}
