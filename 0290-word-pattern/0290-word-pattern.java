class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] stringAtChar = new String[26];
        Arrays.fill(stringAtChar," ");
        Set<String> set = new HashSet<>();
        String[] words = s.split(" ");
        if (words.length!=pattern.length())
            return false;
        for (int i = 0 ; i < words.length ; i++ ){
            int charIndex = pattern.charAt(i)-'a';
            if (stringAtChar[charIndex].equals(" ")){
                if (set.contains(words[i]))
                    return false;
                stringAtChar[charIndex]=words[i];
                set.add(words[i]);
            }else {
                if (!stringAtChar[charIndex].equals(words[i])){
                    return false;
                }
            }
        }
        return true;
    }
}