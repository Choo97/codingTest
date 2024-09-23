package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P181890 {

    public String[] solution(String[] str_list) {
        String[] answer = new String[0];
        List<String> list = new ArrayList<>(Arrays.asList(str_list));

        int lIndex = list.indexOf("l");
        int rIndex = list.indexOf("r");

        List<String> subList = new ArrayList<>();

        if (lIndex == -1 && rIndex == -1) {

            return answer;
        }

        // 'l'이 먼저 나올 경우
        if (lIndex != -1 && (rIndex == -1 || lIndex < rIndex)) {
            subList.addAll(list.subList(0, lIndex));  // 'l'의 왼쪽 부분 리스트 추출

            answer = new String[subList.size()];

            for (int i = 0; i < subList.size(); i++) {
                answer[i] = subList.get(i);
            }
        }
        // 'r'이 먼저 나올 경우
        else if (rIndex != -1 && (lIndex == -1 || rIndex < lIndex)) {
            subList.addAll(list.subList(rIndex + 1, list.size()));  // 'r'의 오른쪽 부분 리스트 추출

            answer = new String[subList.size()];

            for (int i = 0; i < subList.size(); i++) {
                answer[i] = subList.get(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] str_list = {"u", "u", "r", "r"};

        P181890 p181890 = new P181890();
        String[] solution = p181890.solution(str_list);
        System.out.println();
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }

}
