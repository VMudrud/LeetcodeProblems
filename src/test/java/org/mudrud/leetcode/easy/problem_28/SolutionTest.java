package org.mudrud.leetcode.easy.problem_28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final String haystack = "sadbutsad";
        final String needle = "sad";
        final Solution solution = new Solution();
        final int result = solution.strStr(haystack, needle);
        assertEquals(0, result);
    }

    @Test
    public void testSolution_case2() {
        final String haystack = "leetcode";
        final String needle = "leeto";
        final Solution solution = new Solution();
        final int result = solution.strStr(haystack, needle);
        assertEquals(-1, result);
    }

    @Test
    public void testSolution_case3() {
        final String haystack = "l";
        final String needle = "l";
        final Solution solution = new Solution();
        final int result = solution.strStr(haystack, needle);
        assertEquals(0, result);
    }

    @Test
    public void testSolution_case4() {
        final String haystack = "codeleet";
        final String needle = "leet";
        final Solution solution = new Solution();
        final int result = solution.strStr(haystack, needle);
        assertEquals(4, result);
    }

    @Test
    public void testSolution_case5() {
        final String haystack = "mississippi";
        final String needle = "issip";
        final Solution solution = new Solution();
        final int result = solution.strStr(haystack, needle);
        assertEquals(4, result);
    }
}
