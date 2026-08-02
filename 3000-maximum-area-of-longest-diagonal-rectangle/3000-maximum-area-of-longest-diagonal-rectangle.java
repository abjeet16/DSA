class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int maxDig = Integer.MIN_VALUE;
        int res = Integer.MIN_VALUE;
        for(int[] side : d){
            int curr = side[0]*side[0]+side[1]*side[1];
            if(curr>maxDig){
                maxDig = curr;
                res = side[0]*side[1];
            }else if(curr==maxDig){
                res = Math.max(res,side[0]*side[1]);
            }
        }
        return res;
    }
}