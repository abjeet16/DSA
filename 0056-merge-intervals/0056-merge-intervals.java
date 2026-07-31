class Solution {
    public static int[][] merge(int[][] intervals) {
        List<int[]> resList = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int[] i : intervals){
            if (i[0]<=end){
                if (i[1]>end){
                    end=i[1];
                }
            }else{
                int[] range = {start,end};
                resList.add(range);
                start = i[0];
                end = i[1];
            }
        }
        int[] range = {start,end};
        resList.add(range);
        int len = resList.size();
        int[][] res = new int[len][2];
        for (int i = 0 ; i < len; i++)
            res[i]=resList.get(i);
        return res;
    }
}