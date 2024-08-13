package org.mudrud.leetcode.easy.problem_1;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int complement = target - nums[index];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), index};
            }
            numToIndex.put(nums[index], index);
        }
        return new int[2];
    }
}