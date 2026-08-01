class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    // If nums2 is empty, nothing to do
    if (n == 0) return;

    int i = m - 1;          // last valid index in nums1
    int j = n - 1;          // last index in nums2
    int k = m + n - 1;      // fill position from the end in nums1

    // Merge while both sides have elements
    while (i >= 0 && j >= 0) {
        if (nums1[i] >= nums2[j]) {
            nums1[k--] = nums1[i--];
        } else {
            nums1[k--] = nums2[j--];
        }
    }

    // If anything remains in nums2, copy it (nums1's leftovers are already in place)
    while (j >= 0) {
        nums1[k--] = nums2[j--];
    }
}
}