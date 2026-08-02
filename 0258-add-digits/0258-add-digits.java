class Solution {
    public int addDigits(int num) {
        int ans = num;
        while(num>9){
            num = getSum(num);
            if(num!=0){
                ans = num;
            }
        }
        return ans;
    }
    public int getSum(int num){
        int res = 0;
        while(num!=0){
            res+=(num%10);
            num/=10;
        }
        return res;
    }
}