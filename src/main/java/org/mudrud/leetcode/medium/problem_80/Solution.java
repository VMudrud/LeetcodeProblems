package org.mudrud.leetcode.medium.problem_80;

public class Solution {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n<=2){
            return n;
        }
        int counter = 2;
        for (int i = 2; i <n; i++) {
            if (nums[i] != nums[counter - 2]) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}