package org.mudrud.leetcode.easy.problem_50;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final String word = "   fly me   to   the moon  ";
        final Solution solution = new Solution();
        final int result = solution.lengthOfLastWord(word);
        assertEquals(4, result);
    }

    @Test
    public void testSolution_case2() {
        final String word = "luffy is still joyboy";
        final Solution solution = new Solution();
        final int result = solution.lengthOfLastWord(word);
        assertEquals(6, result);
    }

    @Test
    public void testSolution_case3() {
        final String word = "a";
        final Solution solution = new Solution();
        final int result = solution.lengthOfLastWord(word);
        assertEquals(1, result);
    }
}
