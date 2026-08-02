class Solution {
    public int minFlips(String s) {
        String t = s+s;
        int len = s.length();
        StringBuilder rStr1 = new StringBuilder();
        for(int i = 0 ; i < len*2 ; i++){
            rStr1.append(i%2==0?'1':'0');
        }
        int i = 0 , j = 0;
        int res1 = 0 ,res2 =0;
        int res = Integer.MAX_VALUE;
        while(j<len*2){
            if(t.charAt(j)!=rStr1.charAt(j))res1++;
            else res2++;
            if(j-i+1>len){
                if(t.charAt(i)!=rStr1.charAt(i))res1--;
                else res2--;
                i++;
            }
            if(j-i+1==len)
                res = Math.min(res, Math.min(res1, res2));
            j++;
        }
        return res;
    }
}