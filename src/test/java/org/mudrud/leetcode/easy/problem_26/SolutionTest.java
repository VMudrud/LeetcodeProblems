package org.mudrud.leetcode.easy.problem_26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        final Solution solution = new Solution();
        solution.removeDuplicates(nums);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4}, nums);
    }
}
