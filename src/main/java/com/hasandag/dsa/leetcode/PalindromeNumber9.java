package com.hasandag.dsa.leetcode;

// -ea VM to enable assertions

public class PalindromeNumber9 {
    public static void main(String[] args) {
        assert isPalindrome(121);
        assert isPalindrome(12);
    }

    public static boolean isPalindrome(int x) {
        int n=0;
        for(int i = x;i>0;i/=10){
            n = n*10+i%10;
        }
        return x==n;
    }
}
