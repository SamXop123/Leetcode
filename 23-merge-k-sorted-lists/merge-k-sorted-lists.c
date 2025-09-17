/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* mergeKLists(struct ListNode** lists, int listsSize) {
    struct ListNode merged;
    merged.next = NULL;

    for (int i = 0; i < listsSize; i++) {
        struct ListNode* temp = lists[i];

        while (temp != NULL) {
            struct ListNode* node = (struct ListNode*)malloc(sizeof(struct ListNode));
            node->val = temp->val;
            node->next = NULL;

            struct ListNode* prev = &merged;
            while (prev->next != NULL && prev->next->val < node->val) {
                prev = prev->next;
            }

            node->next = prev->next;
            prev->next = node;

            temp = temp->next;
        }
    }

    return merged.next;
}
