class Solution {
    public int numDecodings(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo,-1);
        if(s.charAt(0)=='0')return 0;
        return find(s,0,memo);
    }
    private int find(String s,int i,int[] memo){
        if(i==s.length()){
            return 1;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        char curr = s.charAt(i);
        if(curr=='0'){
            return 0;
        }
        int res = find(s,i+1,memo);
        if(i<s.length()-1){
            if(curr=='1'||(curr=='2'&&s.charAt(i+1)<'7')){
                res+=find(s,i+2,memo);
            }
        }
        return memo[i]=res;
    }
}