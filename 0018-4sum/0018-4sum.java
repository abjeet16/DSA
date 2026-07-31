class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0 ; i < nums.length-3 ; i++){
            if (i>0&&nums[i]==nums[i-1])
                continue;
            for (int j = i+1; j < len-2; j++) {
                if (j>i+1&&nums[j]==nums[j-1])
                    continue;
                long req = (long) target-nums[i]-nums[j];
                int three = j+1;
                int four = len-1;
                while (three<four){
                    long sum = (long) nums[three]+nums[four];
                    if(sum==req){
                        res.add(List.of(nums[i],nums[j],nums[three],nums[four]));
                        while (three<four&&nums[three]==nums[three+1])
                            three++;
                        while (three<four&&nums[four]==nums[four-1])
                            four--;
                        three++;four--;
                    } else if (sum>req) {
                        four--;
                    }else {
                        three++;
                    }
                }
            }
        }
        return res;
    }
}