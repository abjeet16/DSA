class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        int len = target.length;
        for (int i = 0; i < len; i++) {
            count[target[i]]++;
            count[arr[i]]--;
        }
        for (int ele : count){
            if (ele!=0)
                return false;
        }
        return true;
    }
}