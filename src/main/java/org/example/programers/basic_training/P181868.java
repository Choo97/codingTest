package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P181868 {

    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        String[] s = my_string.split(" ");

        for (String s1 : s) {
            if (!s1.equals("")) {
                list.add(s1);
            }
        }

        String[] strs = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strs[i] = list.get(i);
        }

        return strs;
    }

    public String[] solution2(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);

        int N = st.countTokens();

        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[n] = st.nextToken();
        return result;
    }

    public static void main(String[] args) {
        P181868 p181868 = new P181868();

        String s = "    programmers  ";
        p181868.solution(s);
    }

}
