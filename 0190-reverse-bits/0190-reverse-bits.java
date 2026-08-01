class Solution {
    public int reverseBits(int n) {
        StringBuilder str = new StringBuilder();
        while(n!=0){
            str.append(n%2);
            n/=2;
        }
        int sq = 1;
        int len = str.length();
        str.repeat('0',32-len);
        int res = str.charAt(31)=='1'?1:0;
        for(int i = 30 ; i >= 0; i--){
            sq*=2;
            res+=str.charAt(i)=='1'?sq:0;
        }
        return res;
    }
}