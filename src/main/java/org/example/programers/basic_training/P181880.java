package org.example.programers.basic_training;

public class P181880 {

    /*
    * 정수가 있을 때, 짝수라면 반으로 나누고, 홀수라면 1을 뺀 뒤 반으로 나누면, 마지막엔 1이 됩니다. 예를 들어 10이 있다면 다음과 같은 과정으로 1이 됩니다.

10 / 2 = 5
(5 - 1) / 2 = 2
2 / 2 = 1
위와 같이 3번의 나누기 연산으로 1이 되었습니다.
    * */

    public int solution(int[] num_list) {
        int count = 0;
        for (int i = 0; i < num_list.length; i++) {
            while (num_list[i] != 1) {
                if (num_list[i] % 2 == 0) {
                    num_list[i] = num_list[i] / 2;
                    count++;
                } else if (num_list[i] % 2 == 1) {
                    num_list[i] = (num_list[i] - 1) / 2;
                    count++;
                }
            }
        }

        return count;
    }

}
