/*4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      List<Integer> l=new ArrayList<>();
      for(int i=0;i<nums1.length;i++){
        l.add(nums1[i]);
      }
      for(int j=0;j<nums2.length;j++){
        l.add(nums2[j]);
      }
      int[] a=new int[l.size()];
      for(int k=0;k<l.size();k++){
        a[k]=l.get(k);
      }
      Arrays.sort(a);
      if(a.length%2!=0){
        return a[a.length/2];
      }
      else{
        return (double)(a[a.length/2]+a[(a.length/2)-1])/2;
      }

    }
}
