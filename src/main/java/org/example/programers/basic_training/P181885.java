package org.example.programers.basic_training;

import java.util.ArrayList;
import java.util.List;

public class P181885 {

    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < todo_list.length; i++) {

            if (finished[i] == false) {
                list.add(todo_list[i]);
            }
        }

        int listSize = list.size();
        String[] strings = new String[listSize];

        for (int i = 0; i < listSize; i++) {
            strings[i] = list.get(i);
        }

        return strings;
    }

}
