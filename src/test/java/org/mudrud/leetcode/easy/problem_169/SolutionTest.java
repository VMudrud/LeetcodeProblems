package org.mudrud.leetcode.easy.problem_169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums = {1, 2, 2, 1, 1, 1};
        final Solution solution = new Solution();
        final int result = solution.majorityElement(nums);
        assertEquals(1, result);
    }
}
