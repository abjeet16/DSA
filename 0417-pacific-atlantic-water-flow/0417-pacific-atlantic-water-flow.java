class Solution {
    static int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0)
            return res;

        int row = heights.length, col = heights[0].length;
        boolean[][] pacific  = new boolean[row][col];
        boolean[][] atlantic = new boolean[row][col];

        // DFS from Pacific (top row, left col) and Atlantic (bottom row, right col)
        for (int c = 0; c < col; c++) {
            dfs(heights, 0, c, Integer.MIN_VALUE, pacific);        // top edge
            dfs(heights, row - 1, c, Integer.MIN_VALUE, atlantic); // bottom edge
        }
        for (int r = 0; r < row; r++) {
            dfs(heights, r, 0, Integer.MIN_VALUE, pacific);        // left edge
            dfs(heights, r, col - 1, Integer.MIN_VALUE, atlantic); // right edge
        }

        // Cells reachable to both oceans
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    res.add(Arrays.asList(r, c));
                }
            }
        }
        return res;
    }

    public static void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean) {
        if (i < 0 || i >= ocean.length || j < 0 || j >= ocean[0].length) return;
        if (heights[i][j] < prev || ocean[i][j]) return; // must be non-decreasing (reverse flow)
        ocean[i][j] = true;
        for (int[] d : dir) {
            dfs(heights, i + d[0], j + d[1], heights[i][j], ocean); // <-- pass current height
        }
    }
}