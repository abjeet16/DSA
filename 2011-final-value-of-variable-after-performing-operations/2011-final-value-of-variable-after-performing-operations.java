class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String str : operations){
            if (str.charAt(0)=='-'||str.charAt(2)=='-'){
                res--;
            }else{
                res++;
            }
        }
        return res;
    }
}