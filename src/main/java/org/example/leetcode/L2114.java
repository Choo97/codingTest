package org.example.leetcode;

public class L2114 {

    public int mostWordsFound(String[] sentences) {

        int count = 0;

        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
//            System.out.println(words.length);

            if (words.length > count) {
                count = words.length;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        L2114 l2114 = new L2114();

        int i = l2114.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});

        System.out.println(i);

    }
}
