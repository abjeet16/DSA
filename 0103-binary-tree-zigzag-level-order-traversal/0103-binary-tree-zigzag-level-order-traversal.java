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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (root == null) {
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        //zigzag(root, result);
        q.offer(root);
        boolean leftToRight = true;
        while (!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                var node = q.poll();

                if (!leftToRight) {
                    level.addFirst(node.val);
                } else {
                    level.addLast(node.val);
                }

                if(node.left != null ) q.offer(node.left);
                if(node.right != null ) q.offer(node.right);

            }
            leftToRight = !leftToRight;
            result.add(level);

        }
        return result;
    }
}