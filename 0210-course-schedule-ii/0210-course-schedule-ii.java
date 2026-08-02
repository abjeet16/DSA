class Solution {
    public int[] findOrder(int nc, int[][] pre) {
        List<List<Integer>> mat = new ArrayList<>();
        int[] inorder = new int[nc];

        for(int i = 0 ; i < nc ; i++){
            mat.add(new ArrayList<>());
        }
        for(int[] c:pre){
            int c1 = c[0];
            int c2 = c[1];
            mat.get(c2).add(c1);
            inorder[c1]++;
        }

        Queue<Integer> q = new LinkedList<>();
        int[] res = new int[nc];
        int idx = 0;

        for(int i = 0 ; i < nc ;i++){
            if(inorder[i]==0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.poll();
            res[idx++] = curr;
            for(int i : mat.get(curr)){
                inorder[i]--;
                if(inorder[i]==0)q.offer(i);
            }
        }
        return idx==nc?res:new int[0];
    }
}