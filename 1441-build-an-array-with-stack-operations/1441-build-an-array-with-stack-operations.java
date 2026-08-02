class Solution {
    public static List<String> buildArray(int[] target, int n) {
        int i = 1;
        int j = 0;
        int len = target.length;
        List<String> res = new ArrayList<>();
        while (j<len&&i<=n){
            res.add("Push");
            if (target[j]!=i){
                res.add("Pop");
            }else {
                j++;
            }
            i++;
        }
        return res;
    }
}