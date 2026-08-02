class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i = left;i<=right ;i++){
            int bitCount = Integer.bitCount(i);
            if(isPrime(bitCount)){
                res++;
            }
        }
        return res;
    }

    private boolean isPrime(int num){
        if(num<2)return false;
        if(num<4)return true;
        if(num%2==0||num%3==0)return false;
        for(int i=5;i<=num/2;i+=6){
            if(num%i==0||num%(i+2)==0)return false;
        }
        return true;
    }
}