package org.example.programers;

public class P181914 {

    public int solution(String number) {
        int answer = 0;

        int length = number.length();

        for (int i = 0; i < length; i++) {
            String substring = number.substring(i, i + 1);
            answer += Integer.parseInt(substring);
        }

        return answer % 9;
    }

    public static void main(String[] args) {
        P181914 p181914 = new P181914();

        String s = "123";

        p181914.solution(s);
    }

}
