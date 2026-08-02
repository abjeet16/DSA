class Solution {
    public static int minOperations(int[] nums) {
        int n = nums.length;

        int count1 = 0;
        /// count number of 1's
        for (int num : nums) {
            if (num == 1)
                count1++;
        }
        /// if there are 1's that means we can convert every non-one number to 1 in just 1 opration so
        if (count1 > 0) {
            return n - count1;
        }

        int minStepsTo1 = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int gcdVal = nums[i];
            for (int j = i + 1; j < n; j++) {
                gcdVal = gcd(gcdVal, nums[j]);

                if (gcdVal == 1) {
                    minStepsTo1 = Math.min(minStepsTo1, j - i);
                    break;
                }
            }
        }

        if (minStepsTo1 == Integer.MAX_VALUE) {
            return -1;
        }

        return minStepsTo1 + (n - 1);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}