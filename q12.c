/*Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
 

Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
Example 3:

Input: columnTitle = "ZY"
Output: 701*/
int titleToNumber(char* columnTitle) {
    int result=0;
    while(*columnTitle){
        result=result*26+(*columnTitle-'A'+1);
        columnTitle++;
    }
    return result;
}
