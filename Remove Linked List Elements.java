/**203. Remove Linked List Elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pn=head;
        ListNode cn=head;
       
      
        while(cn!=null){
        if(cn.val==val){
            if(cn==head){
                head=cn.next;
                pn=pn.next;
                cn=cn.next;

            }
            else{
           pn.next=cn.next;
           cn=cn.next;
           
        }}
        else{
        pn=cn;
        cn=cn.next;
        
        }}
        
        
       return head;
        
        
    }
}
