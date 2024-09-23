package org.example.programers.basic_training;

import java.math.BigInteger;

public class P181846 {

    public String solution(String a, String b) {
        String answer = "";

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        answer += A.add(B);

        return answer;
    }

}
