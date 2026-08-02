class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int s = m*n;
        int[] flat = new int[s];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                flat[i*n+j] = grid[i][j];
            }
        }

        k%=s;
        rev(flat,0,s-1);
        rev(flat,0,k-1);
        rev(flat,k,s-1);
        for(int i = 0 ; i < m ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j < n ; j++){
                row.add(flat[i*n+j]);
            }
            res.add(row);
        }
        return res;
    }
    private void rev(int[] arr,int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}