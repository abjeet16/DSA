class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        solve(board,0,res,n);
        return res;
    }

    private void solve(boolean[][] board, int j, List<List<String>> res,int n) {
        if (j==n){
            addBoard(board,res,n);
            return;
        }
        for (int i = 0 ; i < n ;i++){
            if (isSafe(board,i,j)){
                board[i][j] = true;
                solve(board, j+1, res, n);
                board[i][j] = false;
            }
        }
    }

    private void addBoard(boolean[][] board, List<List<String>> res,int n) {
        List<String> curr = new ArrayList<>();
        for (int i = 0 ;i < n; i++){
            StringBuilder str = new StringBuilder();
            for (int j = 0 ; j < n ;j++){
                str.append(board[i][j]?'Q':'.');
            }
            curr.add(str.toString());
        }
        res.add(curr);
    }

    private boolean isSafe(boolean[][] board,int i,int j){
        for (int k = j-1; k >=0 ; k--) {
            if (board[i][k])return false;
        }
        int c = 1;
        while (i-c>=0&&j-c>=0){
            if (board[i-c][j-c])return false;
            c++;
        }
        c=1;
        while (i+c< board.length&&j-c>=0){
            if (board[i+c][j-c])return false;
            c++;
        }
        return true;
    }
}