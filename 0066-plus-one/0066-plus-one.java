class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1;i>=0;i--){
            if(i==0&&digits[0]==9){
                int[] res = new int[len+1];
                res[0] = 1;
                return res;
            }
            if(digits[i]==9){
                digits[i]=0;
            }else{
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}