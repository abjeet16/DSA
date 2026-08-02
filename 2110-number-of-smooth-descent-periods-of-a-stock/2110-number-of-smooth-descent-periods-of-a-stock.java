class Solution {
    public long getDescentPeriods(int[] prices) {
        long res = 1;
        int periodLen = 1;
        int len = prices.length;
        for (int i = 1 ; i < len ; i++){
            if (prices[i-1]==prices[i]+1){
                periodLen++;
            }else {
                periodLen = 1;
            }
            res+=periodLen;
        }
        return res;
    }
}