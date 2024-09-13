package org.example.programers.basic_training;

import java.util.ArrayList;

public class P181892 {

    public ArrayList solution(int[] num_list, int n) {

        ArrayList list = new ArrayList();


        for (int i = n-1; i < num_list.length-1; i++) {
            list.add(num_list[i]);
        }

        return list;
    }

}
