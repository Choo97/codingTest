package org.example.programers.basic_training;

public class P181913 {

    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();
        int s, e;
        String prefix, middle, suffix;

        for (int i = 0; i < queries.length; i++) {
            sb.setLength(0);
            s = queries[i][0];
            e = queries[i][1];
            prefix = my_string.substring(0, s);
            middle = my_string.substring(s, e + 1);
            suffix = my_string.substring(e + 1);
            middle = sb.append(middle).reverse().toString();
            my_string = prefix + middle + suffix;
        }
        return my_string;
    }

}
