/*Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

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

Input: columnNumber = 1
Output: "A"
Example 2:

Input: columnNumber = 28
Output: "AB"
Example 3:

Input: columnNumber = 701
Output: "ZY"*/
char* convertToTitle(int columnNumber) {
    
       char* result = (char*)malloc(10 * sizeof(char)); // Allocate memory for result
    int index = 0;

    while (columnNumber > 0) {
        columnNumber--; // Adjust for 1-based indexing
        result[index++] = 'A' + (columnNumber % 26);
        columnNumber /= 26;
    }

    result[index] = '\0';
int left = 0, right = strlen(result) - 1;

    // Reverse the string
    while (left < right) {
        // Swap characters
        char temp = result[left];
        result[left] = result[right];
        result[right] = temp;
        
        left++;
        right--;
    }

    return result;
}
