class Solution {
    public boolean checkStrings(String s1, String s2) {
        int[] freq = new int[26];
        for(int i = 0 ; i < s1.length() ; i+=2){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i : freq)
            if(i!=0)return false;
        for(int i = 1 ; i < s1.length() ; i+=2){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i : freq)
            if(i!=0)return false;
        return true;
    }
}