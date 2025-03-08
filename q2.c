/*Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.*/
#include<stdio.h>
#include <stdbool.h>
#include <limits.h> 

bool isPalindrome(int x) {
    int r,rev=0,k;
    k=x;
    if(x<0){
        return false;
    }
    else{
    while(x!=0){
        r=x%10;
        if (rev > INT_MAX / 10 || (rev == INT_MAX / 10 && r > INT_MAX % 10)) {
            return false;  // Overflow would occur, so return false
        }
        rev=rev*10+r;
        x=x/10;

    }
    x=k;
    if(x==rev){
        return true;
    }
    else
    return false;
}}
