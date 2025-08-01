package org.mudrud.leetcode.easy.problem_35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] array = {1,3,5,7};
        final Solution solution = new Solution();
        final int result = solution.searchInsert(array, 5);
        assertEquals(2, result);
    }

    @Test
    public void testSolution_case2() {
        final int[] array = {1,3,5,6};
        final Solution solution = new Solution();
        final int result = solution.searchInsert(array, 7);
        assertEquals(4, result);
    }

    @Test
    public void testSolution_case3() {
        final int[] array = {1,3,5,6};
        final Solution solution = new Solution();
        final int result = solution.searchInsert(array, 2);
        assertEquals(1, result);
    }

    @Test
    public void testSolution_case4() {
        final int[] array = {1,3,5,6};
        final Solution solution = new Solution();
        final int result = solution.searchInsert(array, 0);
        assertEquals(0, result);
    }

    @Test
    public void testSolution_case5() {
        final int[] array = {1,3};
        final Solution solution = new Solution();
        final int result = solution.searchInsert(array, 2);
        assertEquals(1, result);
    }

    @Test
    public void testSolution_case6() {
        final int[] array = {1,2,3,4,5,6,7,8,9};
        final Solution solution = new Solution();
        final int result = solution.searchInsert(array, 2);
        assertEquals(1, result);
    }
}
