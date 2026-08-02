class Solution {
    public static int countPalindromicSubsequence(String s) {
        int n = s.length();
        int res = 0;
        int [] freq = new int[26];
        for (char ch : s.toCharArray()){
            freq[ch-'a']++;
        }

        // For every possible character x
        for (char c = 'a'; c <= 'z'; c++) {
            if (freq[c-'a']<2)
                continue;

            int left = -1, right = -1;

            // Find first and last occurrence
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == c) {
                    if (left == -1) left = i;
                    right = i;
                }
            }

            // Count unique middles
            boolean[] seen = new boolean[26];
            for (int i = left + 1; i < right; i++) {
                seen[s.charAt(i) - 'a'] = true;
            }

            // Sum distinct middle chars
            for (boolean b : seen) if (b) res++;
        }

        return res;
    }
}