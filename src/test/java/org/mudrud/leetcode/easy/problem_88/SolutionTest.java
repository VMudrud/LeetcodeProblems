package org.mudrud.leetcode.easy.problem_88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums1 = {1, 2, 3, 0, 0, 0};
        final int[] nums2 = {2, 5, 6};
        final int m = 3;
        final int n = 3;
        final Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void testSolution_case2() {
        final int[] nums1 = {1};
        final int[] nums2 = {};
        final int m = 1;
        final int n = 0;
        final Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testSolution_case3() {
        final int[] nums1 = {0};
        final int[] nums2 = {1};
        final int m = 0;
        final int n = 1;
        final Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void testSolution_case4() {
        final int[] nums1 = {4, 5, 6, 0, 0, 0};
        final int[] nums2 = {1, 2, 3};
        final int m = 3;
        final int n = 3;
        final Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    @Test
    public void testSolution_case5() {
        final int[] nums1 = {4, 0, 0, 0, 0, 0};
        final int[] nums2 = {1, 2, 3, 5, 6};
        final int m = 1;
        final int n = 5;
        final Solution solution = new Solution();
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }
}
