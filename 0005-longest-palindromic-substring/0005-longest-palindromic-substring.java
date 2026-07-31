class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String res = "";

        for(int i = 0;i<n;i++){
            String odd = check(i,i,s);
            String even = check(i,i+1,s);
            if(res.length()<odd.length()){
                res = odd;
            }
            if(res.length()<even.length()){
                res = even;
            }
        }
        return res;
    }
    String check(int i , int j ,String s){
        while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1,j);
    }
}