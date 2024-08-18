package org.mudrud.leetcode.easy.problem_125;

public class Solution {

    public boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        final char[] resultChars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        if (resultChars.length == 0 || resultChars.length == 1) {
            return true;
        }
        boolean result = false;
        for (int i = 0; i < resultChars.length / 2; i++) {
            if (resultChars[i] == resultChars[resultChars.length -1 - i]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }
}