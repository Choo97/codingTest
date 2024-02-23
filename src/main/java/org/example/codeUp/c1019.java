package org.example.codeUp;

import java.util.Scanner;

class c1019 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine();
            String[] ss = s.split("\\.");

            int s1 = Integer.parseInt(ss[0]);
            int s2 = Integer.parseInt(ss[1]);
            int s3 = Integer.parseInt(ss[2]);

            System.out.printf("%04d.%02d.%02d", s1, s2, s3);
        }

}
