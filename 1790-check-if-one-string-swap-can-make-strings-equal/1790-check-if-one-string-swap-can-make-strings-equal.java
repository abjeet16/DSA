class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int len = s1.length();
        int c = 0;
        int[] c1 = new int[26];
        int[] c2 = new int[26];
        for(int i = 0 ; i < len ; i ++){
            c1[s1.charAt(i)-'a']++;
            c2[s2.charAt(i)-'a']++;
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(c>2)
                    return false;
            }
        }
        for(int i = 0 ; i < 26 ; i++){
            if(c1[i]!=c2[i])
                return false;
        }
        return true;
    }
}