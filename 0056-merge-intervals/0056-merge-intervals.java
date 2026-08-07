class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)->a[0]==b[0]?Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]));
        for(int[] i : in)
            System.out.println(Arrays.toString(i));

        int start = in[0][0];
        int end = in[0][1];
        List<int[]> res = new ArrayList<>();
        
        for(int i = 1 ; i < in.length ; i++){
            if(in[i][0]>end){
               
                res.add(new int[]{start,end});
                start = in[i][0];
                end = in[i][1];
            }else{
                //System.out.println(start+" "+end);
                if(end<in[i][1])end = in[i][1];
                //System.out.println(start+" "+end);
            }
        }
        res.add(new int[]{start,end});
        int[][] ans = new int[res.size()][2];
        for(int i = 0 ; i < res.size() ; i++){
            ans[i] = res.get(i);
        }
        return ans;
    }
}