package org.mudrud.leetcode.easy.problem_50;

class Solution {
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        boolean lastWordStarted = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != ' ') {
                lastWordStarted = true;
                counter++;
            }
            if (lastWordStarted && chars[i] == ' ') {
                return counter;
            }
        }
        return counter;
    }
}