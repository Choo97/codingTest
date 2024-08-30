package org.example.inflearn.codingsense;

import java.util.Scanner;

/**
 * 문제 3. 연립방정식
 *
 * 숫자 A, B, C, D, E, F가 주어집니다.
 *
 * 다음 연립방정식에서 x와 y값을 계산하는 프로그램을 작성하세요.
 *
 * { Ax + By = C}
 * { Dx + Ey = F}
 *
 * 범위 - x와 y는 -10000이상 10000이하인 정수이다.
 *
 * 예
 * @input 1 3 -1 4 1 7
 * @output 2 -1
 * */
public class T19532 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        for (int x = -10000; x <= 10000; x++) {
            for (int y = -10000; y <= 10000; y++) {
                if (a * x + b * y == c) {
                    if (d * x + e * y == f) {
                        System.out.println(x + " " + y);
                    }
                }
            }
        }
    }
}
