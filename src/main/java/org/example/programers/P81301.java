package org.example.programers;

public class P81301 {

    public int solution(String s) {
        int answer = 0;
        s = s.replaceAll("zero", "0");
        s = s.replaceAll("one", "1");
        s = s.replaceAll("two", "2");
        s = s.replaceAll("three", "3");
        s = s.replaceAll("four", "4");
        s = s.replaceAll("five", "5");
        s = s.replaceAll("six", "6");
        s = s.replaceAll("seven", "7");
        s = s.replaceAll("eight", "8");
        s = s.replaceAll("nine", "9");

        System.out.println(s);

        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        P81301 p81301 = new P81301();
        p81301.solution("one4seveneight");
    }
}
