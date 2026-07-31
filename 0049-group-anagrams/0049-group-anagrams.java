class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] freq = new int[26];
            countFreq(freq,str);
            StringBuilder s = new StringBuilder();
            for(int i = 0 ; i < 26 ; i++){
                char ch = (char)('a'+i);
                s.repeat(ch,freq[i]);
            }
            List<String> ans = ans = map.getOrDefault(s.toString(),new ArrayList<>());
            ans.add(str);
            map.put(s.toString(),ans);
        }
        map.forEach((key, list) -> {
            res.add(list);
        });
        return res;
    }
    private void countFreq(int[] freq , String str){
        for(char ch : str.toCharArray())freq[ch-'a']++;
    }
}