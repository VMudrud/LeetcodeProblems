package org.mudrud.leetcode.medium.problem_189;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final int[] nums = {1,2,3,4,5,6,7};
        final Solution solution = new Solution();
        solution.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[]{5,6,7,1,2,3,4}, nums);
    }
}
