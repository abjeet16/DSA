import java.util.*;

class Solution {
    public static long maximumTotalDamage(int[] power) {
        if (power.length == 0) return 0;

        // Step 1: Sort the powers
        Arrays.sort(power);

        // Step 2: Combine duplicates and calculate total "earn" per value
        List<Integer> vals = new ArrayList<>();
        List<Long> earn = new ArrayList<>();

        for (int i = 0; i < power.length; ) {
            int v = power[i];
            long sum = 0;
            while (i < power.length && power[i] == v) {
                sum += v;
                i++;
            }
            vals.add(v);
            earn.add(sum);
        }

        int n = vals.size();
        long[] dp = new long[n + 1];
        dp[n] = 0; // base case

        // Step 3: Work backwards
        for (int i = n - 1; i >= 0; i--) {
            int target = vals.get(i) + 3;

            // \U0001f539 Find next valid index using our custom binary search
            int nextIdx = findNextIndex(vals, target, i + 1);

            long take = earn.get(i) + dp[nextIdx]; // include this value
            long skip = dp[i + 1];                 // skip this value

            dp[i] = Math.max(take, skip);          // take the better option
        }

        return dp[0]; // final result
    }

    // \U0001f539 Custom Binary Search
    // Finds the index of the first number >= target
    // If not found, returns vals.size()
    private static int findNextIndex(List<Integer> vals, int target, int start) {
        int low = start;
        int high = vals.size() - 1;
        int ans = vals.size(); // default: no valid number found

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (vals.get(mid) >= target) {
                ans = mid;       // possible answer
                high = mid - 1;  // search on the left side for earlier valid index
            } else {
                low = mid + 1;   // move right
            }
        }
        return ans;
    }

}