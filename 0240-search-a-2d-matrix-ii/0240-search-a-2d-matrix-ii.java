class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int r = m.length , c = m[0].length;
        int i = 0 , j = c-1;
        while(i<r&&j>=0){
            if(t==m[i][j])return true;
            else if(m[i][j]<t)i++;
            else j--;
        }
        return false;
    }
}