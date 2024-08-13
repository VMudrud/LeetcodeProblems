package org.mudrud.leetcode.medium.problem_40;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sumResult = l1.val + l2.val;
        int shift = 0;
        if (sumResult >= 10) {
            sumResult = sumResult - 10;
            shift = 1;
        }
        l2.val = sumResult;
        if (l1.next == null && l2.next == null && shift == 0) {
            return l2;
        }
        if (l1.next == null && l2.next == null) {
            l2.next = new ListNode(shift);
            return l2;
        }
        return addTwoNumbersWithShift(l1.next, l2.next, shift);
    }

    private ListNode addTwoNumbersWithShift(ListNode l1, ListNode l2, int shift) {
        if (l1 == null && l2 == null && shift == 0) {
            return l2;
        }
        createNodeIfNull(l1, l2);
        int sumResult = l1.val + l2.val + shift;
        int intShift = 0;
        if (sumResult >= 10) {
            sumResult = sumResult - 10;
            intShift = 1;
        }
        l2.val = sumResult;
        return addTwoNumbersWithShift(l1.next, l2.next, intShift);
    }

    private void createNodeIfNull(ListNode l1, ListNode l2) {
        if (l1 == null) {
            l1 = new ListNode();
        }
        if (l2 == null) {
            l2 = new ListNode();
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}


