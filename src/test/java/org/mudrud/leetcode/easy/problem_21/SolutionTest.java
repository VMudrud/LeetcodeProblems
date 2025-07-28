package org.mudrud.leetcode.easy.problem_21;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution_case1() {
        final Solution solution = new Solution();
        ListNode listNode1 = new ListNode(3, new ListNode(5));
        ListNode listNode2 = new ListNode(1, new ListNode(4, new ListNode(6)));

        ListNode result = solution.mergeTwoLists(listNode1, listNode2);
        List<Integer> expected = Arrays.asList(1, 3, 4, 5, 6);
        for(Integer number : expected) {
            assertEquals(number, result.val);
            result = result.next;
        }
    }


}
