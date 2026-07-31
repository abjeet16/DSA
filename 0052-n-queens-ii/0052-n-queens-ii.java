class Solution {
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        int count = helper(board,0);
        return count;
    }

    private static int helper(char[][] board, int column) {
        if (column == board.length){
            return 1;
        }
        int count = 0;
        for (int row = 0 ; row < board.length;row++){
            if (isSafe(board,row,column)){
                board[row][column]='Q';
                count += helper(board,column+1);
                //if the solution goes wrong in future
                board[row][column]='.';
            }
        }
        return count;
    }

    private static boolean isSafe(char[][] board, int row, int column) {
        //check horizontal
        for (int i = 0;i < board.length;i++){
            if (board[row][i]=='Q'){
                return false;
            }
        }
        //upper left
        for (int i = row,j=column;i>=0&&j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //lower left
        for (int i = row,j=column;i<board.length&&j>=0;i++,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
}