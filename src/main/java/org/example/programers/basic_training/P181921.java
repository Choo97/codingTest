package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181921 {
    /*
    * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
    * */
    public int[] solution(int l, int r) {
        List<Integer> result = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isMadeOfZeroAndFive(i)) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        int[] answer = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    public boolean isMadeOfZeroAndFive(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

}
