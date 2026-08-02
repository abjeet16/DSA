class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        int c = 1;
        while(c<=n){
            int temp = c;
            int count = 0;
            while(temp!=0){
                count+=temp%2;
                temp/=2;
            }
            res[c]=count;
            c++;
        }
        return res;
    }
}