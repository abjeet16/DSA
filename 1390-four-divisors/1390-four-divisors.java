class Solution {
    public static int sumFourDivisors(int[] nums) {
        int res = 0;
        for (int i : nums){
            int sum = 0;
            int divCount = 0;
            for (int j = 1 ; j*j <= i ; j++){
                if (i%j==0){
                    int k = i/j;
                    divCount++;
                    sum+=j;
                    if (k!=j){
                        divCount++;
                        sum+=k;
                    }
                }
                if (divCount>4)
                    break;
            }
            if (divCount==4)
                res+=sum;
        }
        return res;
    }
}