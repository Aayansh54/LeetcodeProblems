/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
 #include <math.h>
int getDecimalValue(struct ListNode* head) {
    int i = 0;
    int sum = 0;
    struct ListNode* temp = head;
    while(temp!=NULL)
    {
        i++;
        temp = temp->next;
    }
    temp = head;
    i=i-1;
    while(temp!=NULL)
    {
        if(temp->val == 1)
        sum = sum + pow(2,i);
        temp = temp->next;
        i--;
    }
    return sum;
}