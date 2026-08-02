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
    public ListNode rotateRight(ListNode head, int k) {
        if (head==null||k==0)
            return head;
        int len = 1;
        ListNode temp = head;
        while (temp.next!=null){
            len++;
            temp = temp.next;
        }
        k%=len;
        temp.next = head;
        temp = head;
        int till = len-k-1;
        while (till-->0){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}