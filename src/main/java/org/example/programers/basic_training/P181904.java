package org.example.programers.basic_training;

public class P181904 {

    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        int length = my_string.length();
        String[] strings = new String[length / m];
        int count = 0;

        for (int i = 0; i < length; i+=m) {
            strings[count] = my_string.substring(i, i+m);
            count++;
        }

        for (int i = 0; i < strings.length; i++) {
            sb.append(strings[i].charAt(c - 1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        P181904 p181904 = new P181904();

        String my_string = "programmers";
        int m = 1;
        int c = 1;

        String solution = p181904.solution(my_string, m, c);

    }

}
