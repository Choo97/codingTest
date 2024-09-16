package org.example.programers.basic_training;

public class P181887 {

    /*
    * num_list의 인덱스가 홀수이면
    * 홀수인덱스들의 합을 새로운 숫자1에 넣는다.
    *
    * num_list의 인덱스가 짝수이면
    * 짝수인덱스들의 합을 새로운 숫자2에 넣는다.
    *
    * 새로운 숫자들 중에 큰 값을 리턴한다.
    * */
    public int solution(int[] num_list) {
        int temp1 = 0;
        int temp2 = 0;

        for (int i = 1; i < num_list.length+1; i++) {

            if (i % 2 == 0) {
               temp1 += num_list[i-1];
            }

            if (i % 2 == 1) {
                temp2 += num_list[i-1];
            }

        }

        return Math.max(temp1, temp2);
    }
}
