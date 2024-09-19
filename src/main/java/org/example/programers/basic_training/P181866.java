package org.example.programers.basic_training;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P181866 {

    public String[] solution(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x", false);

        int countTokens = st.countTokens();
        String[] strings = new String[countTokens];

        for (int i = 0; i < countTokens; i++) {
            strings[i] = st.nextToken();
        }

        Arrays.sort(strings, (o1, o2) -> o1.compareTo(o2));

        return strings;
    }

}
