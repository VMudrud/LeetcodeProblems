package org.mudrud.leetcode.easy.problem_21;

class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list3 = new ListNode();
        ListNode tail = list3;
        ListNode current1 = list1;
        ListNode current2 = list2;

        while (current1 != null && current2 != null)
        {
            if (current1.val <= current2.val)
            {
                tail.next = current1;
                current1 = current1.next;
            }
            else
            {
                tail.next = current2;
                current2 = current2.next;
            }
            tail = tail.next;
        }

        if (current1 != null)
        {
            tail.next = current1;
        }
        else if (current2 != null)
        {
            tail.next = current2;
        }

        return list3.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(3, new ListNode(5));
        ListNode listNode2 = new ListNode(1, new ListNode(4, new ListNode(6)));
        Solution solution = new Solution();
        System.out.println(solution.mergeTwoLists(listNode1, listNode2));
    }
}