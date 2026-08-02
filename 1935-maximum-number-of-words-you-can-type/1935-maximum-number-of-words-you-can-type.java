class Solution {
   public static int canBeTypedWords(String text, String brokenLetters) {
        boolean[] isBroken = new boolean[26];
        for (int i = 0; i < brokenLetters.length();i++){
            isBroken[brokenLetters.charAt(i)-'a']=true;
        }
        int result = 0;
        for (int i = 0 ; i < text.length() ; i++){
            if (text.charAt(i) == ' '||(i==text.length()-1 && !isBroken[text.charAt(i) - 'a']))
                result++;
            else {
                if (isBroken[text.charAt(i) - 'a']) {
                    while (i < text.length() && text.charAt(i) != ' ') {
                        i++;
                    }
                }
            }
        }
        return result;
    }
}