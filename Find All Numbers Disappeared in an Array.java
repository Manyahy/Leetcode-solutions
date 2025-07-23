/*

448. Find All Numbers Disappeared in an Array
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

 

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]
Example 2:

Input: nums = [1,1]
Output: [2]*/
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> l1=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            l1.add(nums[i]);
        }
        int n =nums.length;
        List<Integer> l2=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!l1.contains(i)){
                l2.add(i);
            }
        }
        return l2;

        
    }
}
 

