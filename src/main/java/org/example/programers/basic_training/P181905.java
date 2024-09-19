package org.example.programers.basic_training;

public class P181905 {

    public String solution(String my_string, int s, int e) {

        String s1 = my_string.substring(0, s);
        String s2 = my_string.substring(s, e + 1);
        String s3 = my_string.substring(e + 1, my_string.length());

        StringBuffer sb = new StringBuffer(s2);

        return s1 + sb.reverse().toString() + s3;
    }
}
