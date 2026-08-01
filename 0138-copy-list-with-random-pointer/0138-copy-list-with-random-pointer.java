/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null)
            return null;
        Node temp = head;
        while(temp!=null){
            Node clone = new Node(temp.val);
            clone.next = temp.next;
            temp.next = clone;
            temp = clone.next;
        }
        temp = head;
        while(temp!=null){
            Node clone = temp.next;
            if(temp.random!=null)
                clone.random = temp.random.next;
            temp = clone.next;
        }
        temp = head;
        Node clone = head.next;
        while(temp!=null){
            Node temp2 = temp.next;
            temp.next = temp2.next;
            if(temp.next!=null)
                temp2.next = temp2.next.next;
            temp = temp.next;
        }
        return clone;
    }
}