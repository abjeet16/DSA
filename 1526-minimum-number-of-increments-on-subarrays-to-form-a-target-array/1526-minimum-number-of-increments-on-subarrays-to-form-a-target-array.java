class Solution {
    public static int minNumberOperations(int[] target){
        int res = target[0];
        int len = target.length;
        for (int i = 1 ; i < len ; i++){
            if (target[i]>target[i-1]) {
                res += target[i] - target[i-1];
            }
        }
        return res;
    }
}