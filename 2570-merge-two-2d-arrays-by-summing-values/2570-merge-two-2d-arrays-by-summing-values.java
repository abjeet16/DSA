class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        List<int[]> reslist = new ArrayList<>();
        while (i<len1&&j<len2){
            if (nums1[i][0]<nums2[j][0]) {
                reslist.add(nums1[i]);
                i++;
            }else if (nums2[j][0]<nums1[i][0]){
                reslist.add(nums2[j]);
                j++;
            }else{
                nums1[i][1]+=nums2[j][1];
                reslist.add(nums1[i]);
                i++;j++;
            }
        }
        while (i<len1){
            reslist.add(nums1[i]);
            i++;
        }
        while (j<len2){
            reslist.add(nums2[j]);
            j++;
        }
        int[][] res = new int[reslist.size()][2];
        i = 0;
        for (int[] row : reslist){
            res[i][0] = row[0];
            res[i][1] = row[1];
            i++;
        }
        return res;
    }
}