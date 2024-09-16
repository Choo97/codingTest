package org.example.programers.basic_training;

public class P181864 {

    public int solution(String myString, String pat) {

        String replace = myString.replace("A", "C");
        String replace1 = replace.replace("B", "A");
        String replace2 = replace1.replace("C", "B");

        if (replace2.contains(pat)) {
            return 1;
        }

        return 0;
    }

}
