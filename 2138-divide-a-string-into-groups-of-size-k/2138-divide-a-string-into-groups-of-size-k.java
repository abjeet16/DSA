class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int rl = len/k;
        if(len%k!=0)
            rl++;
        String[] res = new String[rl];
        StringBuilder curr = new StringBuilder();
        int rc = 0;
        int c =0;
        for(int i = 0 ; i < len ; i++){
            curr.append(s.charAt(i));
            c++;
            if(c==k){
                res[rc]=curr.toString();
                curr= new StringBuilder();
                rc++;
                c=0;
            }
        }
        if(c>0){
            curr.repeat(fill,k-c);
            res[rc]=curr.toString();
        }
        return res;
    }
}