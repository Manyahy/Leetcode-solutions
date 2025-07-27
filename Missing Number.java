/*268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 

Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2*/

//First Approach
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return n;
    }
}
//Second Approach
import java.util.HashSet;

class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        
        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) return i;
        }
        return -1;  // Should never hit
    }
}

