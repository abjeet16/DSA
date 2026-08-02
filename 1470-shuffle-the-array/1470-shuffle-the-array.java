class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int j = 0;
        for(int i = 0 ; i < n*2; i++){
            if(i%2==0){
                res[i]=nums[j];
            }
            else{
                res[i]=nums[n+j];
                j++;
            }
        }
        return res;
    }
}