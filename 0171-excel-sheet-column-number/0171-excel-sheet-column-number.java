class Solution {
    public int titleToNumber(String ct) {
        int res = 0;
        int n = ct.length();
        for(int i = 0; i < n ; i++){
            res = res * 26 + (ct.charAt(i)-'A'+1);
        }
        return res;
    }
}