class Solution {
    public int countSymmetricIntegers(int low, int high) {
        if(low<10)
            low=11;
        int res = 0;
        while(low<=high){
            String s = Integer.toString(low);
            int len = s.length();
            if(len%2!=0){
                low+=100;
                continue;
            }
            int left = 0;
            for(int i = 0 ; i < len/2 ;i++)
                left+=s.charAt(i)-'0';
            int right = 0; 
            for(int i = len/2 ; i < len ; i++)
                right+=s.charAt(i)-'0';
            if(left==right){
                res++;
                left+=10;
            }
            low++;
        }
        return res;
    }
}