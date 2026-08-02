class Solution {
    public int numEnclaves(int[][] board) {
        Queue<int[]> q = new LinkedList<>();
        int m = board.length-1;
        int n = board[0].length-1;

        for (int j = 0; j <= n; j++) {
            if (board[0][j] == 1) {
                q.offer(new int[]{0, j});
                board[0][j] = 0;
            }
            if (board[m][j] == 1){
                q.offer(new int[]{m, j});
                board[m][j] = 0;
            }
        }
        for(int i = 0; i <= m; i++) { 
            if (board[i][0] == 1){
                q.offer(new int[]{i, 0});
                board[i][0] = 0;
            }
            if (board[i][n] == 1){
                q.offer(new int[]{i, n});
                board[i][n] = 0;
            }
        }

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int i = temp[0];
            int j = temp[1];
            if(i-1>=0&&board[i-1][j]==1){
                q.offer(new int[]{i-1, j});
                board[i-1][j]=0;
            }

            if(i+1<=m&&board[i+1][j]==1){
                q.offer(new int[]{i+1, j});
                board[i+1][j]=0;
            }

            if(j-1>=0&&board[i][j-1]==1){
                q.offer(new int[]{i, j-1});
                board[i][j-1]=0;
            }

            if(j+1<=n&&board[i][j+1]==1){
                q.offer(new int[]{i, j+1});
                board[i][j+1]=0;
            }
        }
        int res = 0;
        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ;j++){
                res+=board[i][j];
            }
        }
        return res;
    }
}