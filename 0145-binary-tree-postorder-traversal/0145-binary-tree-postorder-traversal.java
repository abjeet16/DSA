/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        doTraversal(root,res);
        return res;
    }
    void doTraversal(TreeNode root,List<Integer>res){
        if(root==null)
            return;
        doTraversal(root.left,res);
        doTraversal(root.right,res);
        res.add(root.val);
    }
}