class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int num) {
        int temp = num;
        int divisor = 0;
        while (temp!=0){
            divisor+=temp%10;
            temp/=10;
        }
        if(num%divisor==0)
            return divisor;
        else
            return -1;
    }
}