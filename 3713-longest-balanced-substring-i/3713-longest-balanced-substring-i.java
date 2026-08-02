class Solution {
    public int longestBalanced(String s) {
        int res = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int[] freq = new int[26];
            int max = 0;
            int j = i;
            for (; j < s.length() ; j++){
                freq[s.charAt(j)-'a']++;
                max = Math.max(max,freq[s.charAt(j)-'a']);
                if (check(max,freq))
                    res = Math.max(res,j-i+1);
            }
        }
        return res;
    }

    private boolean check(int max, int[] freq) {
        for (int i : freq)
            if (i!=0&&i!=max)
                return false;
        return true;
    }
}