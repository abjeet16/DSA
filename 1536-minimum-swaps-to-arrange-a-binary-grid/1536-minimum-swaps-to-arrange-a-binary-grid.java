class Solution {
        public int minSwaps(int[][] grid) {
        int n = grid.length;
        int res = 0;
        int[] zeroAtEnd = new int[n];
        for (int i = 0 ; i < n ; i++){
            int zeroCount = 0;
            for (int j = n-1;j>0&&grid[i][j]!=1;j--){
                if (grid[i][j]==0)
                    zeroCount++;
            }
            zeroAtEnd[i] = zeroCount;
        }
        for (int i = 0 ; i < n ; i ++){
            int req = n-i-1;
            if (zeroAtEnd[i]<req){
                int found = -1;
                for (int j = i+1;j<n;j++){
                    if (zeroAtEnd[j]>=req){
                        found = j;
                        break;
                    }
                }
                if (found==-1)return -1;
                for (int j = found ; j>i ; j--){
                    res++;
                    zeroAtEnd[j] = zeroAtEnd[j-1];
                }
            }
        }
        return res;
    }
}