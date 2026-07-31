class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board){
        for(int i = 0 ; i < 9 ; i ++){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j]=='.'){
                    for(char k = '1' ; k <= '9' ; k ++){
                        board[i][j]=k;
                        if(check(board,i,j)&&solve(board)) return true;
                        board[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private boolean check(char[][] board,int i,int j){
        //horizonal
        for(int x = 0 ; x < 9 ; x++){
            if(x!=j&&board[i][x]==board[i][j])
                return false;
        }
        //vertical
        for(int x = 0 ; x < 9 ; x++){
            if(x!=i&&board[x][j]==board[i][j])
                return false;
        }
        int boxstart = 3*(i/3);
        int boxend = 3*(j/3);
        for(int x = boxstart ; x<boxstart+3 ;x++){
            for(int y = boxend ; y <boxend+3;y++){
                if(x==i&&y==j)
                    continue;
                if(board[x][y]==board[i][j])
                    return false;
            }
        }
        return true;
    }
}