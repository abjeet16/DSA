class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();
        while (columnNumber!=0){
           columnNumber--;
           res.append((char) ('A'+columnNumber%26));
           columnNumber/=26;
        }
        return res.reverse().toString();
    }
}