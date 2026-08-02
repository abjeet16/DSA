/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
       List<Integer> res=  new ArrayList<>();
        doTraveral(res,root);
        return res;
    }
    void doTraveral(List<Integer> res,Node node){
        if(node == null)
            return;
        for(Node i :  node.children){
            doTraveral(res,i);
        }
        res.add(node.val);
    }
}