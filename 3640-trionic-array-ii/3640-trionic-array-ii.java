class Solution {
    int n;
    long[][] memo;
    long neg = Long.MIN_VALUE/2;
    public long maxSumTrionic(int[] nums) {
        n = nums.length;
        memo = new long[n][4];
        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], Long.MIN_VALUE);
        }
        return solve(nums,0,0);
    }

    private long solve(int[] nums, int i, int trend) {
        if (i==n){
            return trend==3?0:neg;
        }
        long take = neg;
        long skip = neg;
        if (memo[i][trend]!=Long.MIN_VALUE)
            return memo[i][trend];
        if(trend==0){
            skip = solve(nums, i+1, trend);
        }
        if (trend==3){
            take = nums[i];
        }

        if (i+1<n){
            int curr = nums[i];
            int nxt = nums[i+1];
            if (trend==0&&curr<nxt){
                take = Math.max(take,curr+solve(nums, i+1, 1));
            }
            if (trend==1){
                if (curr<nxt){
                    take = Math.max(take,curr+solve(nums, i+1, trend));
                }else if (curr>nxt){
                    take = Math.max(take,curr+solve(nums, i+1, 2));
                }
            }else if (trend==2){
                if(curr>nxt){
                    take = Math.max(take,curr+solve(nums, i+1, trend));
                }else if (curr<nxt){
                    take = Math.max(take,curr+solve(nums, i+1, 3));
                }
            }else if (trend==3&&curr<nxt){
                take = Math.max(take,curr+solve(nums, i+1, trend));
            }
        }
        return memo[i][trend]=Math.max(take,skip);
    }
}