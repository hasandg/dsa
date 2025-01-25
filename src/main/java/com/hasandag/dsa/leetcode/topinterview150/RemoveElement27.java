package com.hasandag.dsa.leetcode.topinterview150;

import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        RemoveElement27 removeElement27 = new RemoveElement27();
        int[] nums = {2,3,2,3,5};
        int val = 3;
        int count = removeElement27.removeElement(nums, val);
        System.out.println(count);
        System.out.println(Arrays.toString(nums));
    }

    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
