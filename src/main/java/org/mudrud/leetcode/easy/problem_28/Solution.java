package org.mudrud.leetcode.easy.problem_28;

public class Solution {

    public int strStr(String haystack, String needle) {
        int haystackLength = haystack.length();
        int needleLength = needle.length();
        if (needleLength > haystackLength) return -1;

        int haystackIndex = 0;
        int needleCounter = 0;
        while (haystackIndex < haystackLength) {
            if (haystack.charAt(haystackIndex) == needle.charAt(needleCounter)) {
                needleCounter++;
                haystackIndex++;
                if (needleCounter == needleLength) return haystackIndex - needleLength;
            } else {
                haystackIndex = haystackIndex - needleCounter + 1;
                needleCounter = 0;
            }
        }
        return -1;
    }
}