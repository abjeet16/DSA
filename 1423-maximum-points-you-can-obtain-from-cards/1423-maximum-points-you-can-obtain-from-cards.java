class Solution {
    public int maxScore(int[] cp, int k) {
        int n = cp.length;
        int i =  n-k, j = 0;
        int curr = 0;
        for(int x = i ; x < n ; x++){
            curr+=cp[x];
        }
        int res = curr;
        if(k==n)return curr;
        while(j<k){
            curr-=cp[i];
            curr+=cp[j];
            res =  Math.max(res,curr);
            i++;
            j++;
        }
        return res;
    }
}