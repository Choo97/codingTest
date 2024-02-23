package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int zero = 0;

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] n = new int[4];

        n[0] = length(x, zero);
        n[1] = length(y, zero);
        n[2] = length(w, x);
        n[3] = length(h, y);
        int min = n[0];

        for (int i = 1; i < n.length; i++) {
            if (n[i] < min) {
                min = n[i];
            }
        }

        System.out.println(min);

    }

    private static int length(int a,int b) {
        return Math.abs(a-b);
    }
}
