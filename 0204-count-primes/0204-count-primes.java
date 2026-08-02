class Solution {
    public int countPrimes(int n) {
        boolean[] composite = new boolean[n];
        int res = 0;
        for(int i = 2 ; i < n ; i++){
            if(!composite[i]){
                res++;
                for(int j = i ; j < n ; j+=i)composite[j]=true;
            }
        }
        return res;
    }
}