class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowedChar = new boolean[26];
        int res = 0;
        for (char ch : allowed.toCharArray()){
            allowedChar[ch-'a']=true;
        }
        for (String str : words){
            res++;
            for (char ch : str.toCharArray()){
                if (!allowedChar[ch-'a']) {
                    res--;
                    break;
                }
            }
        }
        return res;
    }
}