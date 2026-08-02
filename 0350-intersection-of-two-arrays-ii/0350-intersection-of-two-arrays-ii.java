class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] flag1 = new int[1001];
        int[] flag2 = new int[1001];
        for (int i : nums1)
            flag1[i]++;
        for (int i : nums2)
            flag2[i]++;
        int ansSize = 0;
        List<Integer> anslist = new ArrayList<>();

        for (int i : nums1){
            if (flag1[i]>0&&flag2[i]>0) {
                int freq = Math.min(flag1[i],flag2[i]);
                ansSize+=freq;
                flag1[i]=0;
                for (int j = 0; j < freq; j++) {
                    anslist.add(i);
                }
            }
        }

        int[] ans = new int[anslist.size()];
        for (int i = 0 ; i < anslist.size();i++){
            ans[i] = anslist.get(i);
        }
        return ans;
    }
}