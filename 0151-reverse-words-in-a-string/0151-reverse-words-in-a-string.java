class Solution {
    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        int len = strings.length;
        for (int i = len-1;i>=0;i--){
            if (!strings[i].isEmpty())
                res.append(strings[i].trim()).append(" ");
        }
        return res.toString().trim();
    }
}