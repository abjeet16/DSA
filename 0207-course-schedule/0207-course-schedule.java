class Solution {
    public boolean canFinish(int n, int[][] pr) {
         // Write your code here.
        List<List<Integer>> mat = new ArrayList<>();
        formMat(mat,pr,n);
        boolean[] vis = new boolean[n];
        boolean[] currPath = new boolean[n];
        for(int i = 0 ; i < n ; i++){
            if(!vis[i]&&checkCycle(vis,mat,i,currPath)){
                return false;
            }
        }
        return true;
    }
    private static boolean checkCycle(boolean[] vis,List<List<Integer>> mat,int node,boolean[] currPath){
        vis[node]=true;
        currPath[node]=true;
        for(int i : mat.get(node)){
            if(!vis[i]){
                if(checkCycle(vis,mat,i,currPath))return true;
            }else if(currPath[i])return true;
        }
        currPath[node]=false;
        return false;
    }
    private static void formMat(List<List<Integer>> mat,int[][] pr,int n){
        for(int i = 0 ; i < n ;i++)
            mat.add(new ArrayList<>());
        for(int[] e : pr){
            int i = e[0];
            int j = e[1];
            mat.get(i).add(j);
        }
    }
    
}