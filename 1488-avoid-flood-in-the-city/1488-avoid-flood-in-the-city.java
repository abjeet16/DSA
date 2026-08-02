class Solution {
        public static int[] avoidFlood(int[] rains) {
        HashMap<Integer,Integer> DayIndex = new HashMap<>();
        List<Integer> dryDays = new ArrayList<>();
        for (int  i = 0 ; i < rains.length ; i ++){
            if (rains[i]==0) {
                dryDays.add(i);
                rains[i] = 1;
            }else {
                if (DayIndex.containsKey(rains[i])){
                    int dryingDayIndex = searchDayToDry(dryDays,DayIndex.get(rains[i]));
                    if (dryingDayIndex==-1)
                        return new int[0];
                    DayIndex.put(rains[i],i);
                    rains[dryDays.get(dryingDayIndex)] = rains[i];
                    rains[i] = -1;
                    dryDays.remove(dryingDayIndex);
                }else {
                    DayIndex.put(rains[i],i);
                    rains[i] = -1;
                }
            }
        }
        return rains;
    }

    private static int searchDayToDry(List<Integer> dryDays, int i) {
        int left = 0 , right = dryDays.size()-1,res = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (dryDays.get(mid) > i){
                res = mid;
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return res;
    }
}