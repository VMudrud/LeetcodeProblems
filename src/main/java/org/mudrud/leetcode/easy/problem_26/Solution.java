package org.mudrud.leetcode.easy.problem_26;

import java.util.*;

public class Solution {

    public int removeDuplicates(int[] nums) {
        final Set<Integer> set = new LinkedHashSet<>();
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if(set.add(nums[i])) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}