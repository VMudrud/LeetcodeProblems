package org.mudrud.leetcode.easy.problem_121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums = {7, 1, 5, 3, 6, 4};
        final Solution solution = new Solution();
        final int result = solution.maxProfit(nums);
        assertEquals(5, result);
    }

    @Test
    public void testSolution_case2() {
        final int[] nums = {7, 6, 4, 3, 1};
        final Solution solution = new Solution();
        final int result = solution.maxProfit(nums);
        assertEquals(0, result);
    }

    @Test
    public void testSolution_case3() {
        final int[] nums = {1, 2};
        final Solution solution = new Solution();
        final int result = solution.maxProfit(nums);
        assertEquals(1, result);
    }

    @Test
    public void testSolution_case4() {
        final int[] nums = {2, 4, 1};
        final Solution solution = new Solution();
        final int result = solution.maxProfit(nums);
        assertEquals(2, result);
    }
}
