class Solution {
    public int countLargestGroup(int n) {
        int[] g = new int[n+1];
        int maxFreq = 0;
        int res = 0 ;
        for(int i = 1 ; i <= n ; i++){
            int temp = i;
            int sum = 0;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            g[sum]++;
            if(g[sum]>maxFreq){
                res = 1;
                maxFreq = g[sum];
            }else if(g[sum]==maxFreq)
                res++;
        }
        return res;
    }
}