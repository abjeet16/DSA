class Solution {
    public int[] rotateElements(int[] nums, int k) {
    List<Integer> pos = new ArrayList<>();

    // collect positive numbers
    for (int i : nums) {
        if (i >= 0)
            pos.add(i);
    }

    int n = pos.size();
    if (n == 0) return nums; // edge case

    k = k % n;
    if (k == 0) return nums;

    // rotate positives using reverse method
    rev(pos, 0, k - 1);
    rev(pos, k, n - 1);
    rev(pos, 0, n - 1);

    // put them back
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= 0) {
            nums[i] = pos.get(j++);
        }
    }

    return nums;
}

void rev(List<Integer> list, int i, int j) {
    while (i < j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
        i++;
        j--;
    }
}
}