class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        int prev = -1;
        for (int i = 0 ; i < words.length ; i++){
            if (groups[i]!=prev) {
                res.add(words[i]);
                prev = groups[i];
            }
        }
        return res;
    }
}