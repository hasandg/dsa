package com.hasandag.dsa.leetcode;

public class LongestCommonPrefix14 {


    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        //System.out.println(longestCommonPrefix(strs));
        //System.out.println(longestCommonPrefix(new String[]{}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < 200; k++) {
            char currentChar = ' ';
            boolean foundAChar = false;
            for (int i = 0; i < strs.length; i++) {
                foundAChar = true;
                if (!strs[i].isEmpty()) {
                    if (strs[i].length() < k+1) {
                        return stringBuilder.toString();
                    }
                    if (currentChar == ' ') {
                        currentChar = strs[i].charAt(k);
                    } else {
                        if (currentChar != strs[i].charAt(k)) {
                            return stringBuilder.toString();
                        }
                    }
                } else {
                    return "";
                }
            }
            if (!foundAChar) {
                return stringBuilder.toString();
            }
            stringBuilder.append(currentChar);
        }
        return stringBuilder.toString();
    }

}
