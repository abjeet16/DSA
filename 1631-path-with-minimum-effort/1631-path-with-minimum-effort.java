class Solution {
    int[][] dirs = {{-1,0},{0,1},{1,0},{0,-1}};
    public int minimumEffortPath(int[][] h) {
        int m = h.length;
        int n = h[0].length;
        int[][] dis = new int[m][n];
        for(int[] row : dis)Arrays.fill(row,Integer.MAX_VALUE);
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[2]-b[2]);
        q.offer(new int[]{0,0,0});
        dis[0][0] = 0;
        while(!q.isEmpty()){
            int[] row = q.poll();
            if (row[2] > dis[row[0]][row[1]]) continue;
            int i = row[0];
            int j = row[1];
            if (i == m - 1 && j == n - 1)return row[2];
            for(int[] d : dirs){
                int ni = i+d[0];
                int nj = j+d[1];
                if(ni>=0&&ni<m&&nj>=0&&nj<n){
                    int diff = Math.max(row[2],Math.abs(h[i][j]-h[ni][nj]));
                    if(dis[ni][nj]>diff){
                        dis[ni][nj] = diff;
                        q.offer(new int[]{ni,nj,diff});
                    }
                }
            }
        }
        return dis[m-1][n-1];
    }
}