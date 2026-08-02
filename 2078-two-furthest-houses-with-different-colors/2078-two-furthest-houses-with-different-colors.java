class Solution {
    public int maxDistance(int[] c) {
        int res = 0;
        int n = c.length;
        for(int i = n-1 ; i >= 0 ;i--){
            if(c[i]!=c[0]){
                res = i;
                break;
            }
        }
        for(int i = 0 ; i < n ;i++){
            if(c[i]!=c[n-1]){
                res = Math.max(res,n-i-1);
                break;
            }
        }
        return res;
    }
}