/*
Code
Testcase
Test Result
Test Result
409. Longest Palindrome
Solved
Easy
Topics
premium lock icon
Companies
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome.

 

Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.*/
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII character count array

        // Step 1: Count character frequencies
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Step 2: Build palindrome length
        for (int freq : count) {
            length += (freq / 2) * 2; // Add even part of freq
            if (freq % 2 == 1) {
                hasOdd = true;
            }
        }

        // Step 3: Add 1 if any odd count was found (center character)
        if (hasOdd) {
            length += 1;
        }

        return length;
    }
}
