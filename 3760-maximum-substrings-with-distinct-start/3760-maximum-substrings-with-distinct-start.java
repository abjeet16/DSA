class Solution {
    public int maxDistinct(String s) {
        boolean[] seen = new boolean[26];
        int res = 0;
        for (char ch : s.toCharArray())
            if (!seen[ch-'a']) {
                res++;
                seen[ch-'a']=true;
            }
        return res;
    }
}