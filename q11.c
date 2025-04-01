
/*Code


Testcase
Test Result
Test Result
206. Reverse Linked List
Solved
Easy
Topics
Companies
Given the head of a singly linked list, reverse the list, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []*/
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    
    struct ListNode *cnode,*pnode,*nnode;
    pnode=NULL;
    cnode=nnode=head;
    while(nnode!=NULL){
        
        nnode=nnode->next;
        cnode->next=pnode;
        pnode=cnode;
        cnode=nnode;
    }
    head=pnode;
    return head;


    
}
