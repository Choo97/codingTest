package org.example.inflearn.codingsense;

import java.util.Scanner;

/**
 * 문제 2. 사탕
 * 친구 A, B, C에게 사탕을 나누어 주려고 합니다.
 * 분배 가능한 경우의 수를 출력하는 프로그램을 작성해주세요.
 * 조건은 아래와 같습니다.
 *
 * 정수 한개를 입력받아 세 사람에게 나누어 줄 수 있는 경우의 수를 구하세요.
 *
 * @1. 남는 사탕이 없어야 합니다.
 * @2. A는 B 보다 2개 이상 많은 사탕을 가져야 합니다.
 * @3. 셋 중 사탕을 하나도 못 받는 친구는 없어야 합니다.
 * @4. C가 받는 사탕의 수는 짝수입니다.
 * @예시
 * @input 6
 * @output 1
 */
public class T14568 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int candy = scanner.nextInt();// 6

        int count = 0;

        for (int i = 0; i <= candy; i++) { // 0 ~ 6개
            for (int j = 0; j <= candy; j++) {
                for (int k = 0; k <= candy; k++) {
                    if (i + j + k == 6) {
                        if (i == j + 2) {
                            if (i != 0 && j != 0 && k != 0) {
                                if (k % 2 == 0) {
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);

    }

    public static int divide(int number) {
        int count = 0;

        return 1;
    }
}
