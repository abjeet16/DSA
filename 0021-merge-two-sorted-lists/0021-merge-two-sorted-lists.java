/**
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);  // dummy node to build from
        ListNode tail = dummy;               // tail points to the last node of new list
        
        ListNode p1 = l1; // pointers to traverse original lists
        ListNode p2 = l2;

        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                tail.next = new ListNode(p1.val); // create a new node
                p1 = p1.next;
            } else {
                tail.next = new ListNode(p2.val); // create a new node
                p2 = p2.next;
            }
            tail = tail.next;
        }

        // add remaining elements
        while (p1 != null) {
            tail.next = new ListNode(p1.val);
            tail = tail.next;
            p1 = p1.next;
        }
        while (p2 != null) {
            tail.next = new ListNode(p2.val);
            tail = tail.next;
            p2 = p2.next;
        }

        return dummy.next; // head of new merged list
    }
}
