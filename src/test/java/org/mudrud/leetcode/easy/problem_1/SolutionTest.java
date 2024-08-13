package org.mudrud.leetcode.easy.problem_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums = {2,7,11,15};
        final int target = 9;
        final Solution solution = new Solution();
        final int[] result = solution.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testSolution_case2() {
        final int[] nums = {3,2,4};
        final int target = 6;
        final Solution solution = new Solution();
        final int[] result = solution.twoSum(nums, target);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void testSolution_case3() {
        final int[] nums = {3,3};
        final int target = 6;
        final Solution solution = new Solution();
        final int[] result = solution.twoSum(nums, target);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}
