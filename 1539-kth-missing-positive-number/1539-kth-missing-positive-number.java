class Solution {
    public static int findKthPositive(int[] arr, int k) {
        if (arr[0]>k){
            return k;
        }
        int left = 0 , right = arr.length-1 , res = -1;
        while (left<=right){
            int mid = (left+right)/2;
            int diff = arr[mid]-mid-1;
            if (diff<k) {
                res = mid;
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        res = arr[res]+(k)-(arr[res]-(res+1));
        return res;
    }
}