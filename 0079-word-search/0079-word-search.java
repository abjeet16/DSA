class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        for(int i = 0 ; i < rows ; i ++){
            for(int j = 0 ; j < cols ; j++){
                if(check(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    private boolean check(char[][] board,String word,int idx,int i,int j){
        if(idx==word.length())
            return true;
        if(i<0||j<0||i==board.length||j==board[0].length||word.charAt(idx)!=board[i][j]){
            return false;
        }
        char temp = board[i][j];
        board[i][j]='#';
        idx++;
        boolean res = check(board,word,idx,i+1,j)
        ||check(board,word,idx,i-1,j)
        ||check(board,word,idx,i,j+1)
        ||check(board,word,idx,i,j-1);
        board[i][j]=temp;
        return res;
    }
}