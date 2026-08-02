class Solution {
    public int binaryGap(int n) {
        int prev = -1;
        int count = 0;
        int res = 0;
        while(n!=0){
            int rem = n%2;
            if(rem==1){
                if(prev==-1){
                    prev = count;
                    continue;
                }
                res=Math.max(res,count-prev);
                prev = count;
            }
            count++;
            n/=2;
        }
        return res;
    }
}