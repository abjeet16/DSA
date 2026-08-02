class Solution {
    public int minAbsDifference(int[] nums, int goal) {
        List<Integer> oneHalf = new ArrayList<>();
        List<Integer> twoHalf = new ArrayList<>();
        int len = nums.length;
        getParSum(nums,0,0,len/2,oneHalf);
        getParSum(nums,0,len/2,len,twoHalf);
        Collections.sort(twoHalf);
        int res = Integer.MAX_VALUE;
        for (int i : oneHalf){
            res = Math.min(res,
                    findClosestInSorted(twoHalf,i,goal)
            );
        }
        return res;
    }

    // Finds the minimum |goal - (s1 + some value in list)| using binary search
    private int findClosestInSorted(List<Integer> sortedList, int s1, int goal) {
        int target = goal - s1;
        int lo = 0, hi = sortedList.size() - 1;
        int bestDiff = Integer.MAX_VALUE;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            int s2 = sortedList.get(mid);
            int sum = s1 + s2;
            bestDiff = Math.min(bestDiff, Math.abs(goal - sum));

            if (s2 == target) {
                // Perfect match!
                return bestDiff;
            } else if (s2 < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return bestDiff;
    }

    private void getParSum(int[] nums, int sum, int i, int till, List<Integer> sums) {
        if (i==till){
          sums.add(sum);
          return;
        }
        getParSum(nums, sum+nums[i], i+1, till, sums);
        getParSum(nums, sum, i+1, till, sums);
    }
}