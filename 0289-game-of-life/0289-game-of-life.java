class Solution {
    int[][] moves = {{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0 ; j < n ; j++){
                board[i][j]=check(board,i,j);
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0 ; j < n ; j++){
                int curr = board[i][j];
                if(curr==0||curr==3)board[i][j]=0;
                else board[i][j]=1;
            }
        }
    }
    private int check(int[][] board,int i,int j){
        int c = 0;
        for(int[] move : moves){
            int ni = i+move[0];
            int nj = j+move[1];
            if(ni>=0&&ni<board.length&&nj>=0&&nj<board[0].length&&(board[ni][nj]==1||board[ni][nj]==3)){
                c++;
            }
        }
        if(board[i][j]==0&&c==3)return 2;
        if(board[i][j]==1&&(c<2||c>3))return 3;
        return board[i][j];
    }
}