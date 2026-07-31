class Solution {
    public double myPow(double x, int n) {
        if(n==0)
            return 1.0;
        if(n==-1){
            return 1/x;
        }
        if(n==1)
            return x;
        double pow = myPow(x,n/2);
        if(n%2!=0){
            if(n<0)
                return pow*pow*1/x;
            return pow*pow*x;
        }
        return pow*pow;
    }
}