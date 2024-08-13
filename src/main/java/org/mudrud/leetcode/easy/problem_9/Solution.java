package org.mudrud.leetcode.easy.problem_9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        final List<Integer> list = new ArrayList<>();
        while (x > 0) {
            Integer lastNumber = x % 10;
            x = x / 10;
            list.add(lastNumber);
        }
        boolean result = true;
        for (int i = 0; i < list.size() / 2; i++) {
            result = list.get(i) == list.get(list.size() - i -1);
            if (result == false) {
                break;
            }
        }
        return result;
    }
}