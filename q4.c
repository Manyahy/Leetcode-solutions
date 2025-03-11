/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true*/

bool isValid(char* s) {
int len = strlen(s);
    char stack[10000];  // Stack to hold opening brackets
    int top = -1;     // Stack pointer (initially empty)

    for (int i = 0; i < len; i++) {
        char c = s[i];
        
        // If it's an opening bracket, push it onto the stack
        if (c == '(' || c == '[' || c == '{') {
            stack[++top] = c;
        }
        // If it's a closing bracket, check if it matches the top of the stack
        else if (c == ')' && top >= 0 && stack[top] == '(') {
            top--;  // Pop the stack
        } 
        else if (c == ']' && top >= 0 && stack[top] == '[') {
            top--;  // Pop the stack
        }
        else if (c == '}' && top >= 0 && stack[top] == '{') {
            top--;  // Pop the stack
        } 
        else {
            return false;  // Either no matching opening bracket or incorrect order
        }
    }

    // If the stack is empty, all brackets were matched
    return top == -1;
}
