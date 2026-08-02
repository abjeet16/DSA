class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int m = mat.length, n = mat[0].length;
        add0(q,mat,m,n);
        while(!q.isEmpty()){
            int[] row = q.poll();
            int i = row[0];
            int j = row[1];
            for(int[] d : dir){
                int newI = i+d[0];
                int newJ = j+d[1];
                if(newI>=0&&newJ>=0&&newI<m&&newJ<n&&mat[i][j]+1<mat[newI][newJ]){
                    mat[newI][newJ]=mat[i][j]+1;
                    int[] nxt = new int[2];
                    nxt[0]=newI;
                    nxt[1]=newJ;
                    q.offer(nxt);
                }
            }
        }
        return mat;
    }
    private void add0(Queue<int[]> q,int[][] mat,int m , int n){
        for(int i = 0 ; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(mat[i][j]==0){
                    int[] row = new int[2];
                    row[0]=i;
                    row[1]=j;
                    q.offer(row);
                }else{
                    mat[i][j]=Integer.MAX_VALUE;
                }
            }
        }
    }
}