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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1,l2,0);
    }

    private ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1==null&&l2==null) {
            if (carry==1){
                ListNode res = new ListNode();
                res.val = 1;
                res.next = null;
                return res;
            }
            return null;
        }
        int sum = carry;
        if (l1!=null)
            sum += l1.val;
        if (l2!=null)
            sum += l2.val;
        ListNode res = new ListNode();
        res.val = sum%10;
        carry = sum>9?1:0;
        res.next = add(l1!=null?l1.next:null,
                l2!=null?l2.next:null,carry);
        return res;
    }
}