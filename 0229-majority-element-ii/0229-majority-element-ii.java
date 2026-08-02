class Solution {
    public static List<Integer> majorityElement(int[] nums) {
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int count1 = 0, count2=0;
        for(int i : nums){
            if (count1==0&&i!=ele2){
                count1=1;
                ele1=i;
            } else if (count2==0&&i!=ele1) {
                count2 = 1;
                ele2 = i;
            } else if (i==ele1) {
                count1++;
            } else if (i==ele2) {
                count2++;
            }else {
                count1--;count2--;
            }
        }
        List<Integer> res = new ArrayList<>();
        int need = nums.length/3;
        count1 = need;
        count2 = need;
        for (int i : nums){
            if(i==ele1)
                count1--;
            else if (i==ele2)
                count2--;
        }
        if (count1<0)
            res.add(ele1);
        if (count2<0)
            res.add(ele2);
        return res;
    }
}