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
