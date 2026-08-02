class Solution {
    public static int maxFrequency(int[] nums, int k, int numOperations) {
        int maxVal = Integer.MIN_VALUE;
        for (int num : nums)
            if (maxVal<num)
                maxVal = num;
        maxVal+=k;
        TreeMap<Integer, Integer> diff = new TreeMap<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        int result = 1;


        // O(n log n)
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            int l = Math.max(num - k, 0);
            int r = Math.min(num + k, maxVal);

            diff.put(l, diff.getOrDefault(l, 0) + 1);
            diff.put(r + 1, diff.getOrDefault(r + 1, 0) - 1);

            // Ensure key exists for later iteration
            diff.putIfAbsent(num, diff.getOrDefault(num, 0));
        }

        int cumSum = 0;

        // O(n)
        for (Map.Entry<Integer, Integer> entry : diff.entrySet()) {
            int target = entry.getKey();
            int val = entry.getValue();

            cumSum += val;
            int targetFreq = freq.getOrDefault(target, 0);
            int needConversion = cumSum - targetFreq;

            int maxPossibleFreq = Math.min(needConversion, numOperations);
            result = Math.max(result, targetFreq + maxPossibleFreq);
        }

        return result;
    }
}