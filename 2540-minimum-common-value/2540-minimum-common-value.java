class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0,j = 0;
        int len1 = nums1.length , len2 = nums2.length;
        while (i<len1&&j<len2){
            int num1 = nums1[i];
            int num2 = nums2[j];
            if (num1==num2){
                return num1;
            } else if (num1>num2) {
                j++;
            }else {
                i++;
            }
        }
        return -1;
    }
}