class Solution {
    public static int maxOperations(String s) {
        int oneCount = 0;
        int max = 0;
        int len = s.length();
        for(int i = 0 ;  i < len; i++){
            char ch = s.charAt(i);
            if (ch=='1')
                oneCount++;
            else{
                if (i==len-1||s.charAt(i+1)=='1')
                    max += oneCount;
            }
        }
        return max;
    }
}