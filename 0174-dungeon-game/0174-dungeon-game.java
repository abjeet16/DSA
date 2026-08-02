class Solution {

    public int calculateMinimumHP(int[][] dungeon) {

        int m = dungeon.length;
        int n = dungeon[0].length;

        int left = 1;
        int right = 400 * 1000;
        int ans = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Fresh best array for every binary search iteration
            int[][] best = new int[m][n];
            for (int i = 0; i < m; i++) {
                Arrays.fill(best[i], -1);
            }

            if (possible(mid, 0, 0, dungeon, best)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;
    }

    private boolean possible(int hp, int i, int j, int[][] dungeon, int[][] best) {

        int m = dungeon.length;
        int n = dungeon[0].length;

        if (i >= m || j >= n)
            return false;

        hp += dungeon[i][j];

        if (hp <= 0)
            return false;

        // Already reached this cell with equal or more health
        if (best[i][j] >= hp)
            return false;

        best[i][j] = hp;

        if (i == m - 1 && j == n - 1)
            return true;

        return possible(hp, i + 1, j, dungeon, best)
                || possible(hp, i, j + 1, dungeon, best);
    }
}