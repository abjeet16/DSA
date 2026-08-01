class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[26];
        int count = 0;
        int r = 0 , l = 0;
        int res = 0;
        int prefixNonCommon = 0;
        while(r<s.length()){
            int idx = s.charAt(r)-'a';
            if(freq[idx]==0)count++;
            freq[idx]++;
            while(l<r&&freq[s.charAt(l)-'a']>1){
                freq[s.charAt(l)-'a']--;
                if(freq[s.charAt(l)-'a']==0)count--;
                else prefixNonCommon++;
                l++;
            }
            if(count==3){
                res+=1+prefixNonCommon;
            }
            r++;
        }
        return res;
    }
}