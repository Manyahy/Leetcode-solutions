/*169. Majority Element
Solved
Easy
Topics
premium lock icon
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2*/
class Solution {
    public int majorityElement(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int a :nums){
            s.add(a);
        }
       
        int count=0;
        for(int i:s){
        for(int m=0;m<nums.length;m++){
        
            if(i==nums[m]){
                count++;
            }
            if(count>(nums.length)/2){
                return i;
            }
        }
      
        
        }
        
          return 0;
    }
}
//Beats 100%
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
