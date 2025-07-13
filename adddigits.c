/*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0*/
int addDigits(int num) {
 char str[1000];
 int sum=0;



while(num>=10){
    sum=0;
    sprintf(str, "%d", num);
for(int i=0;i<strlen(str);i++){
    sum=sum+str[i]-'0';

 

}
num=sum;

}
return num;

}
