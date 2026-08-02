class Solution {
    public boolean makeEqual(String[] words) {
        int[] count = new int[26];
        int len = words.length;
        for (String s : words)
            for (char ch : s.toCharArray())
                count[ch-'a']++;
        for (int ele : count)
            if (ele%len!=0)
                return false;
        return true;
    }
}