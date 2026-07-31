class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0; 
        int j = 0;
        int res = 0;
        boolean[] seen = new boolean[128];
        while(i < s.length()){
            while(j<i&&seen[s.charAt(i)]){
                seen[s.charAt(j)]=false;
                j++;
            }
            seen[s.charAt(i)]=true;
            i++;
            res = Math.max(res,i-j);
        }
        return res;
    }
}