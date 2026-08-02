class Solution {
    public int furthestDistanceFromOrigin(String s) {
        int res1 = 0;
        int res2 = 0;
        for(char ch : s.toCharArray()){
            if(ch=='R'){
                res1++;
                res2--;
            }else if(ch=='L'){
                res1--;
                res2++;
            }else{
                res1++;
                res2++;
            }
        }
        return Math.max(res1,res2);
    }
}