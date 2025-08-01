package org.mudrud.leetcode.easy.problem_66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] array = {8,9,9,9};
        final Solution solution = new Solution();
        final int[] result = solution.plusOne(array);
        assertArrayEquals(new int[]{9, 0, 0, 0}, result);
    }

    @Test
    public void testSolution_case2() {
        final int[] array = {9,9,9,9};
        final Solution solution = new Solution();
        final int[] result = solution.plusOne(array);
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, result);
    }
}
