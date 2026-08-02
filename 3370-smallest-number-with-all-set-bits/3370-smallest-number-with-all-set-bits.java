class Solution {
    public static int smallestNumber(int n) {
        int nextAddition = 1;
        int res = 0;
        while (res<n) {
            res += nextAddition;
            nextAddition*=2;
        }
        return res;
    }
}