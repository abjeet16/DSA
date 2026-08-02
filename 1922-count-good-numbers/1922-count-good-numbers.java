class Solution {
    static int mod = 1000000007;
    public static int countGoodNumbers(long n) {
        long evenPos = n/2;
        long oddPos = (n+1)/2;
        long res = (getPow(4,evenPos)*getPow(5,oddPos))%mod;
        return (int)res;
    }

    private static long getPow(int num, long pow) {
        if (pow==0)
            return 1;
        long res = getPow(num,pow/2);
        res = (res*res)%mod;
        if(pow%2!=0){
            res = (res*num)%mod;
        }
        return res;
    }
}