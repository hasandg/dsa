package com.hasandag.dsa.leetcode.topinterview150;

public class RemoveDublicatesFromSortedArrayII80 {

    public static void main(String[] args) {
        RemoveDublicatesFromSortedArrayII80 solution = new RemoveDublicatesFromSortedArrayII80();
        int[] nums = {1, 1, 1, 1, 1, 2, 2, 2, 2, 3};
        //int[] nums = {1, 1, 1, 2, 2, 3};
        //int[] nums = {1, 2};
        System.out.println(solution.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int writerPointer = 1;
        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (writerPointer == 1 || nums[readPointer] != nums[writerPointer - 2]) {
                nums[writerPointer++] = nums[readPointer];
            }
        }
        return writerPointer;
    }

}
