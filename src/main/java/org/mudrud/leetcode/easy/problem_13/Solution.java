package org.mudrud.leetcode.easy.problem_13;

import java.util.Map;

public class Solution {

    private Map<Character, Integer> romans = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && romans.get(s.charAt(i)) < romans.get(s.charAt(i + 1))) {
                res -= romans.get(s.charAt(i));
            } else {
                res += romans.get(s.charAt(i));
            }
        }
        return res;
    }
}