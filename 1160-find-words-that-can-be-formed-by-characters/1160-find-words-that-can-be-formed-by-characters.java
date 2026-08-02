class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for(char ch : chars.toCharArray()){
            freq[ch-'a']++;
        }
        int res = 0;
        for(String curr : words){
            int[] currFreq = freq.clone();
            boolean poss = true;
            for(char c : curr.toCharArray()){
                if(currFreq[c-'a']==0){
                    poss = false;
                    break;
                }
                currFreq[c-'a']--;
            }
            if(poss){
                res = res + curr.length();
            }
        }
        return res;
    }
}