/*345. Reverse Vowels of a String
Solved
Easy
Topics
premium lock icon
Companies
Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "IceCreAm"

Output: "AceCreIm"

Explanation:

The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".

Example 2:

Input: s = "leetcode"

Output: "leotcede"*/
class Solution {
     private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char[] a=s.toCharArray();
        while(i<j){
            if(isVowel(a[i])&&isVowel(a[j])){
                char temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
            if(!isVowel(a[i])){
                i++;
            }
             if(!isVowel(a[j])){
                j--;
            }


    }
    
    String m = new String(a);
    return m;


    
    }
    
}
