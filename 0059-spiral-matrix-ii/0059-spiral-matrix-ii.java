class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] res = new int[n][n];
        int srow = 0, erow = n-1;
        int scol = 0 ,ecol = n-1;
        while(srow<=erow&&scol<=ecol){
            for(int i = scol ; i <= ecol ; i++)
                res[srow][i]=num++;
            srow++;
            for(int i = srow ; i <= erow ; i++)
                res[i][ecol]=num++;
            ecol--;
            for(int i = ecol ; i >= scol ; i--)
                res[erow][i]=num++;
            erow--;
            for(int i = erow ; i >= srow ; i--)
                res[i][scol]=num++;
            scol++;
        }
        return res;
    }
    private void print(int[][] mat){
        for(int[] i:mat)
            System.out.println(Arrays.toString(i));
    }
}