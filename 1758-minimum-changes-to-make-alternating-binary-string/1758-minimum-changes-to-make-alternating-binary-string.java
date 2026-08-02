class Solution {
    public int minOperations(String s) {
        int first0 = 0 , first1 = 0;
        int len = s.length();
        for (int i = 0 ; i < len ; i++){
            char ch = s.charAt(i);
            if (i%2==0){
                if (ch=='0')
                    first1++;
                else 
                    first0++;
            }else {
                if (ch=='0')
                    first0++;
                else
                    first1++;
            }
        }
        return Math.min(first1,first0);
    }
}