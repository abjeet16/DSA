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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        getpaths(root,"",res);
        return res;
    }
    void getpaths(TreeNode node,String curr,List<String>res){
        if(node.right==null&&node.left==null){
            curr+=node.val;
            res.add(curr);
            return;
        }else{
            curr+=node.val+"->";
            if(node.left!=null)
                getpaths(node.left,curr,res);
            if(node.right!=null)
                getpaths(node.right,curr,res);
        }
    }
}