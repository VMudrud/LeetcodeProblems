package org.mudrud.leetcode.medium.problem_80;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        final Solution solution = new Solution();
        solution.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3}, nums);
    }
}
