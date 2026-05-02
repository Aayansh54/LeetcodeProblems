/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* previous,*current,*p;
    previous = NULL;
    current = head;
    p = head;
    while(p != NULL){
        p = current->next;
        current->next = previous;
        previous = current;
        current = p;
    }
    return previous;
}