package org.example.programers.practice_kit.hash;

import java.util.HashMap;
import java.util.HashSet;

/**
*  폰켓몬
* */
public class P1845 {

    public int solution(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();

        for (int num : nums) {
            map.add(num);
        }

        int res = map.size();

        if (nums.length / 2 > res) {
            return res;
        }

        return nums.length/2;
    }


}
