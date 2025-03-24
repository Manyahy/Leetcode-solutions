/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.*/
bool isPalindrome(char* s) {
     int i = 0,j=0;
   
    
    // Traverse through the string until the null-terminator is found
    while (s[i] != '\0') {
        // Convert each character to lowercase if it's uppercase
        s[i] = tolower(s[i]);
        i++;
    }
   i=0;
    while(s[i]!='\0'){
        if(isalnum(s[i])){
            s[j]=s[i];
            j++;
        }
        i++;
    }
    int l=j;

    for(i=0;i<l/2;i++){
       
        if(s[i]!=s[l-1-i]){
            return false;
        }
    }
    return true;
}
