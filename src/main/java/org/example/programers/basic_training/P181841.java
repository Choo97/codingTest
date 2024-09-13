package org.example.programers.basic_training;

public class P181841 {

    /*
    * str_list에서 ex를 찾는다.
    * ex가 존재하면 다음을 탐색한다.
    * 존재하지 않으면 새로운 문자열에 str_list 할당한다.
    *
    * 반복한다.
    * */
    public String solution(String[] str_list, String ex) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                sb.append(str_list[i]);
            }
        }

        return sb.toString();
    }

}
