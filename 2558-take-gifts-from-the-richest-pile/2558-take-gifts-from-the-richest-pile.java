class Solution {
    public static int getRoot(int x) {
        if (x == 0 || x == 1) return x;

        int left = 1, right = x/2, ans = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if (mid==x/mid){
                return mid;
            }
            if (mid<x/mid){
                ans = mid;
                left = mid+1;
            }else {
                right = mid-1;
            }
        }
        return ans;
    }

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        for (int gift : gifts) {
            maxHeap.add(gift);
        }

        for(int i = 0; i < k; i++){
            int element = maxHeap.poll();
            int squared = getRoot(element);
            maxHeap.add(squared);
        }

        long total = 0;

        while(!maxHeap.isEmpty()){
            total += maxHeap.poll();
        }

        return total;
    }

}