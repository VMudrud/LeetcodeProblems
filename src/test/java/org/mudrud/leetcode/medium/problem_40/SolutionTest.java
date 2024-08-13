package org.mudrud.leetcode.medium.problem_40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final Solution.ListNode l1 = new Solution.ListNode(2, new Solution.ListNode(4, new Solution.ListNode(3)));
        final Solution.ListNode l2 = new Solution.ListNode(5, new Solution.ListNode(6, new Solution.ListNode(4)));
        final Solution.ListNode expected = new Solution.ListNode(7, new Solution.ListNode(0, new Solution.ListNode(8)));

        final Solution solution = new Solution();
        final Solution.ListNode result = solution.addTwoNumbers(l1, l2);

        assertEquals(expected.val, result.val);
        assertEquals(expected.next.val, result.next.val);
        assertEquals(expected.next.next.val, result.next.next.val);
    }
}
