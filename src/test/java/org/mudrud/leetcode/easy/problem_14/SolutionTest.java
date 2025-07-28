package org.mudrud.leetcode.easy.problem_14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final String[] strings = {"flower","flow","flight"};
        final Solution solution = new Solution();
        final String result = solution.longestCommonPrefix(strings);
        assertEquals("fl", result);
    }

    @Test
    public void testSolution_case2() {
        final String[] strings = {"dog","racecar","car"};
        final Solution solution = new Solution();
        final String result = solution.longestCommonPrefix(strings);
        assertEquals("", result);
    }

    @Test
    public void testSolution_case3() {
        final String[] strings = {"dog","d"};
        final Solution solution = new Solution();
        final String result = solution.longestCommonPrefix(strings);
        assertEquals("d", result);
    }

    @Test
    public void testSolution_case4() {
        final String[] strings = {"dog","dog"};
        final Solution solution = new Solution();
        final String result = solution.longestCommonPrefix(strings);
        assertEquals("dog", result);
    }
}
