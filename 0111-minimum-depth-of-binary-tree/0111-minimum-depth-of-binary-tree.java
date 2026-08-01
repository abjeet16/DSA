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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return getDepth(root,0);
    }
    public int getDepth(TreeNode root,int count){
        if(root.left==null&&root.right==null)
            return count+1;
        int left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        if(root.left!=null)
            left = Math.min(left,getDepth(root.left,count+1));
        if(root.right!=null)
            right = Math.min(right,getDepth(root.right,count+1));
        return Math.min(left,right);
    }
}