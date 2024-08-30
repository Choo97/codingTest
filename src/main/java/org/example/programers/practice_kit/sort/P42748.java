package org.example.programers.practice_kit.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * K번째 수
 * */
public class P42748 {

    /*
    0. commands의 길이만큼 반복한다.
    1. array의 i번쨰부터 j번쨰까지 자른다.
    2. 자른 array를 정렬한다.
    3. 정렬한array에서 k번쨰의 숫자를 구한다.*/

    public List<Integer> solution(int[] array, int[][] commands) {

        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        int i, j;

        for (int n = 0; n < commands.length; n++) {

            i = commands[n][0]-1;
            j = commands[n][1]-1;

            for (int m = i; m < j+1; m++) {
                list.add(array[m]);
            }
            list.sort((o1, o2) -> o1.compareTo(o2));

            answer.add(list.get(commands[n][2]-1));
            list.clear();

        }

        return answer;
    }

    public static void main(String[] args) {

        P42748 p42748 = new P42748();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };

        p42748.solution(array, commands);

    }

}
