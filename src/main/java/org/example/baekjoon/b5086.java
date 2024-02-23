package org.example.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num1;
        int num2;
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            num1 = Integer.parseInt(st.nextToken());
            num2 = Integer.parseInt(st.nextToken());

            if ( num1<num2 && num2%num1 == 0) {
                System.out.println("factor");
            } else if ( num1>num2 && num1%num2 == 0 ) {
                System.out.println("multiple");
            } else if ( num1 == 0 && num2 == 0) {
                break;
            } else {
                System.out.println("neither");
            }


        }



    }
}
