class Solution {
    public int minScore(int n, int[][] r) {
        List<int[]>[] mat = new ArrayList[n+1];
        formMat(mat,r,n);
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis =  new boolean[n+1];
        q.offer(1);
        vis[1] = true;
        int res = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int[] i : mat[curr]){
                res=Math.min(res,i[1]);
                if(!vis[i[0]]){
                    q.offer(i[0]);
                    vis[i[0]]=true;
                }
            }
        } 
        return res;
    }
    void formMat(List<int[]>[] graph,int[][] roads,int n){
        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();

        for (int[] r : roads) {
            graph[r[0]].add(new int[]{r[1], r[2]});
            graph[r[1]].add(new int[]{r[0], r[2]});
        }
    }
}