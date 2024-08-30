package org.example.baekjoon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class B27866 {

    String s;
    int i;

    public char charAt(String s, int i) {
        char answer;
        answer = s.charAt(i - 1);
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        B27866 question = new B27866();

        String s = scanner.nextLine();
        int i = scanner.nextInt();

        char answer = question.charAt(s, i);

        System.out.println("answer = " + answer);
    }
}
