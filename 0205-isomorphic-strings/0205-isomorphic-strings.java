class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] isoChars = new char[128];
        boolean[] isCharMarked = new boolean[128];
        for (int i = 0 ; i < s.length() ; i++){
            int aCharIndex = s.charAt(i);
            char bChar = t.charAt(i);
            if (isoChars[aCharIndex]=='\u0000'){
                if (isCharMarked[bChar])
                    return false;
                isoChars[aCharIndex]=bChar;
                isCharMarked[bChar] = true;
            }else{
                if (isoChars[aCharIndex]!=bChar)
                    return false;
            }
        }
        return true;
    }
}