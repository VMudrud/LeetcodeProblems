package org.mudrud.leetcode.easy.problem_125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final String testStr = "A man, a plan, a canal: Panama";
        final Solution solution = new Solution();
        final boolean result = solution.isPalindrome(testStr);
        assertTrue(result);
    }

    @Test
    public void testSolution_case2() {
        final String testStr = "A man, a plan, a canal: Antipanama";
        final Solution solution = new Solution();
        final boolean result = solution.isPalindrome(testStr);
        assertFalse(result);
    }

    @Test
    public void testSolution_case3() {
        final String testStr = "A ";
        final Solution solution = new Solution();
        final boolean result = solution.isPalindrome(testStr);
        assertTrue(result);
    }

    @Test
    public void testSolution_case4() {
        final String testStr = "ab_a";
        final Solution solution = new Solution();
        final boolean result = solution.isPalindrome(testStr);
        assertTrue(result);
    }
}
