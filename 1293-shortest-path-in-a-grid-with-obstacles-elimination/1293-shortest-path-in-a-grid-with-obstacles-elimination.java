class Solution {
    int[][] moves = {{0,1},{1,0},{0,-1},{-1,0}};
    int INF = 1000000;

    public int shortestPath(int[][] g, int k) {
        int m = g.length;
        int n = g[0].length;
        boolean[][][] seen = new boolean[m][n][k+1];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,k,0});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            if(curr[0]==m-1&&curr[1]==n-1)return curr[3];
            for(int[] move : moves){
                int ni = curr[0]+move[0];
                int nj = curr[1]+move[1];
                int nk = curr[2];
                if(ni>=0&&ni<m&&nj>=0&&nj<n){
                    if(g[ni][nj]==1){
                        if(nk==0)continue;
                        else nk--;
                    }
                    if(seen[ni][nj][nk])continue;
                    seen[ni][nj][nk]=true;
                    q.offer(new int[]{ni,nj,nk,curr[3]+1});
                }
            }
        }
        return -1;
    }
}