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
    ListNode temp;
    public boolean isPalindrome(ListNode head) {
        temp = head;
        return solve(head);
    }
    boolean solve(ListNode root){
        if(root==null)
            return true;
        if(!solve(root.next)){
            return false;
        }
        if(root.val!=temp.val)
            return false;
        temp = temp.next;
        return true;
    }
}