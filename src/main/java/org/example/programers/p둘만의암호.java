package org.example.programers;

public class p둘만의암호 {
    public static int solution(String s, String skip, int index) {
        int answer = 0;

        char[] ss = new char[s.length()];
        char[] skips = new char[skip.length()];

        for (int i=0; i<s.length(); i++) {
            ss[i] = s.charAt(i);
        }

        for (int i=0; i<skip.length(); i++) {
            skips[i] = skip.charAt(i);
        }




        for (int i=0; i<ss.length; i++) {
            System.out.println(ss[i]);
        }

        return answer;

    }

    public static void main(String[] args) {
        int res = solution("aukks", "wbqd", 5);
        System.out.println(res);
    }
}
