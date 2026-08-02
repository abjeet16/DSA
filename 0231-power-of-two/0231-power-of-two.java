class Solution {
    public static boolean isPowerOfTwo(int n) {
        while (n>0&&n%2==0) {
            n /= 2;
        }
        return n==1;
    }
}