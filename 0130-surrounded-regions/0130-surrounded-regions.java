class Solution {
    public void solve(char[][] board) {
        Queue<int[]> q = new LinkedList<>();
        int m = board.length-1;
        int n = board[0].length-1;

        for (int j = 0; j <= n; j++) {
            if (board[0][j] == 'O') {
                q.offer(new int[]{0, j});
                board[0][j] = 'w';
            }
            if (board[m][j] == 'O'){
                q.offer(new int[]{m, j});
                board[m][j] = 'w';
            }
        }
        for(int i = 0; i <= m; i++) { 
            if (board[i][0] == 'O'){
                q.offer(new int[]{i, 0});
                board[i][0] = 'w';
            }
            if (board[i][n] == 'O'){
                q.offer(new int[]{i, n});
                board[i][n] = 'w';
            }
        }

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int i = temp[0];
            int j = temp[1];
            if(i-1>=0&&board[i-1][j]=='O'){
                q.offer(new int[]{i-1, j});
                board[i-1][j]='w';
            }

            if(i+1<=m&&board[i+1][j]=='O'){
                q.offer(new int[]{i+1, j});
                board[i+1][j]='w';
            }

            if(j-1>=0&&board[i][j-1]=='O'){
                q.offer(new int[]{i, j-1});
                board[i][j-1]='w';
            }

            if(j+1<=n&&board[i][j+1]=='O'){
                q.offer(new int[]{i, j+1});
                board[i][j+1]='w';
            }
        }

        for(int i = 0 ; i <= m ; i++){
            for(int j = 0 ; j <= n ;j++){
                if(board[i][j]=='w')board[i][j]='O';
                else board[i][j]='X';
            }
        }
    }
}