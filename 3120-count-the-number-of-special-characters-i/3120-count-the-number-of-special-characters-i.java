class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] seen = new boolean[26];
        char[] chars =  word.toCharArray();
        for(char ch : chars){
            if(ch>='a'&&ch<='z')seen[ch-'a']=true;
        }
        int res = 0;
        for(char ch : chars){
            if((ch>='A'&&ch<='Z')&&seen[ch-'A']){
                seen[ch-'A']=false;
                res++;
            }
        }
        return res;
    }
}