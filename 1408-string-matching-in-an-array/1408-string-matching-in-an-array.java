class Solution {
    public List<String> stringMatching(String[] words) {
        int len = words.length;
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        List<String> res = new ArrayList<>();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (words[j].contains(words[i])) {
                    res.add(words[i]);
                    break;
                }
            }
        }
        return res;
    }
}