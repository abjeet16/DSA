import java.util.*;

class Solution {
    // Min-heap cell
    static class Cell {
        int r, c, h;
        Cell(int r, int c, int h) { this.r = r; this.c = c; this.h = h; }
    }

    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        if (m == 0) return 0;
        int n = heightMap[0].length;
        if (n == 0) return 0;
        // Need at least a 3x3 to trap water (otherwise edges leak)
        if (m < 3 || n < 3) return 0;

        boolean[][] seen = new boolean[m][n];
        PriorityQueue<Cell> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.h));

        // 1) Push all border cells into the min-heap
        for (int r = 0; r < m; r++) {
            pq.offer(new Cell(r, 0, heightMap[r][0]));
            pq.offer(new Cell(r, n - 1, heightMap[r][n - 1]));
            seen[r][0] = true;
            seen[r][n - 1] = true;
        }
        for (int c = 1; c < n - 1; c++) {
            pq.offer(new Cell(0, c, heightMap[0][c]));
            pq.offer(new Cell(m - 1, c, heightMap[m - 1][c]));
            seen[0][c] = true;
            seen[m - 1][c] = true;
        }

        // Highest boundary we've "built" so far
        int boundary = 0;
        int water = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        // 2) Pop the lowest boundary, expand to neighbors
        while (!pq.isEmpty()) {
            Cell cur = pq.poll();
            // Update the current boundary height
            boundary = Math.max(boundary, cur.h);

            for (int[] d : dirs) {
                int nr = cur.r + d[0], nc = cur.c + d[1];
                if (nr < 0 || nr >= m || nc < 0 || nc >= n || seen[nr][nc]) continue;
                seen[nr][nc] = true;

                int nh = heightMap[nr][nc];
                // If neighbor is lower than boundary, it traps water
                if (nh < boundary) {
                    water += boundary - nh;
                }
                // Push neighbor with effective height = max(neighbor, boundary)
                pq.offer(new Cell(nr, nc, Math.max(nh, boundary)));
            }
        }
        return water;
    }
}
