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
    int mostL = 0;
    int mostR = 0;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        LinkedList<List<int[]>> res = new LinkedList<>();

        res.add(new ArrayList<>());
        form(root, 0, 0, res);
        for (List<int[]> row : res)
            Collections.sort(row, (a, b) -> a[1] == b[1] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
        for (List<int[]> row : res)
            for (int[] j : row)
                System.out.println(Arrays.toString(j));
        List<List<Integer>> ans = new LinkedList<>();

        for (List<int[]> col : res) {
            List<Integer> row = new ArrayList<>();
            for(int[] i : col)
                row.add(i[0]);
            ans.add(row);
        }

        return ans;
    }

    private void form(TreeNode root, int i, int j, LinkedList<List<int[]>> res) {
        if (root == null)
            return;

        if (j < mostL) {
            mostL = j;
            res.addFirst(new ArrayList<>());
        } else if (j > mostR) {
            mostR = j;
            res.addLast(new ArrayList<>());
        }
        int idx = Math.abs(mostL) + j;
        List<int[]> l = res.get(idx);
        l.add(new int[] { root.val, i });
        form(root.left, i + 1, j - 1, res);
        form(root.right, i + 1, j + 1, res);
    }
}