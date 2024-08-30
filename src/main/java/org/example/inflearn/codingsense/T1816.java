package org.example.inflearn.codingsense;

import java.util.Scanner;

public class T1816 {

/**
* 문제1. 비밀번호
 * 확인하고자 하는 수가 주어집니다.
 *
 * 확인하고자 하는 수가 적절한 비밀번호인지 아닌지를 구하는 프로그램을 작성해주세요.
 * 적절하다면 YES, 적절하지 않다면 NO를 출력하면 됩니다.
 *
 * 적절한 비밀번호
 *   -  모든 소인수가 1,000,000 보다 크다면 적절한 비밀번호입니다.
 *
 *   소인수란?
 *   -  1을 제외한 약수를 말합니다.
 *
 *   ex
 *
 *   1000036000099  Yes
 *   1500035500153 No
 *   20000000000002 No
* */

/*
* 소인수를 구하는 공식을 찾아보자
* 1을 제외한 약수를 말하는 거니까 x라는 수가 주어졌을 때,
* 1이외의 수로 나누었을 때 나머지가 없으면 약수, 나머지가 있으면 약수가 아니란 뜻이 된다.
*
* 그러므로 x를 2부터 2 + n 까지 나누었을 때 나머지가 존재한다면 약수
*
* x가 주어졌을 때 100만보다 작거나 2보다 큰 소인수가 존재한다면 적절하지 않은 비밀번호입니다.
* */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long x = scanner.nextLong();

        boolean checkYesOrNo = checkDivisor(x);

        printYesOrNo(checkYesOrNo);

    }

    private static void printYesOrNo(boolean b) {
        if (b == true) {
            System.out.println("YES");
        }

        if (b == false) {
            System.out.println("NO");
        }
    }

    private static Boolean checkDivisor(long x) {

        int oneMillion = 1000000;

        for (long i = oneMillion; i < x; i++) {

            if (x % i == 0) {
                return true;
            }
        }

        return false;
    }
}
