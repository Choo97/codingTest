package org.example.leetcode;

public class L1512 {

    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {

                    count++;
                }

            }
        }
        return count;
    }

    public static void main(String[] args) {
        L1512 l1512v1 = new L1512();

        System.out.println(        l1512v1.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }
}
