class Solution {
    public boolean divideArray(int[] nums) {
        boolean[] pairs = new boolean[501];
        for (int i :  nums)
            pairs[i]=!pairs[i];
        for (boolean pair : pairs)
            if (pair)
                return false;
        return true;
    }
}