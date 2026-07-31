class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        for(int i = 0 ; i < n ; i+=3){
            for(int j = 0 ; j < n ;j+=3){
                if(notValid(i,j,board))return false;
            }
        }
        for(int i = 0 ;i < n ; i++){
            boolean[] seen = new boolean[10];
            for(int j =  0 ; j < n; j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'0';
                    if(seen[num])return false;
                    seen[num]=true;
                }
            }
        }
        for(int i = 0 ;i < n ; i++){
            boolean[] seen = new boolean[10];
            for(int j =  0 ; j < n; j++){
                if(board[j][i]!='.'){
                    int num = board[j][i]-'0';
                    if(seen[num])return false;
                    seen[num]=true;
                }
            }
        }
        return true;
    }
    private boolean notValid(int x,int y,char[][] board){
        boolean[] seen = new boolean[10];
        for(int i = x ; i < x+3 ; i++){
            for(int j = y; j < y+3 ; j++){
                if(board[i][j]!='.'){
                    int num = board[i][j]-'0';
                    if(seen[num])return true;
                    seen[num]=true;
                }
            }
        }
        return false;
    }
}