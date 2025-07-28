package org.mudrud.leetcode.easy.problem_14;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String firstWord = strs[0];
        StringBuilder prefix = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < firstWord.length(); i++) {
            for (String string : strs) {
                if (counter > string.length() - 1) {
                    return prefix.toString();
                }
                if (firstWord.charAt(counter) != string.charAt(counter)) {
                    return prefix.toString();
                }
            }
            prefix.append(firstWord.charAt(counter));
            counter++;
        }
        return prefix.toString();
    }
}