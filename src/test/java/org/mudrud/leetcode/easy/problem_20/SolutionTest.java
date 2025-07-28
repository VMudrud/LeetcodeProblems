package org.mudrud.leetcode.easy.problem_20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final String string = "([])";
        final Solution solution = new Solution();
        final boolean result = solution.isValid(string);
        assertTrue(result);
    }
}
