class Solution {
    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0 ; i < 26 ; i++){
            lastIndex[i]=-1;
        }
        int max = -1;
        for (int i = 0 ; i < s.length() ; i ++){
            int ch = s.charAt(i)-'a';
            if (lastIndex[ch]!=-1){
                max = Math.max(max,i-lastIndex[ch]-1);
            }else {
                lastIndex[ch]=i;
            }
        }
        return max;
    }
}