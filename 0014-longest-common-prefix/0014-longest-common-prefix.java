class Solution {
   public static String longestCommonPrefix(String[] strs) {
        String res = strs[0];
        for (int i = 1 ; i < strs.length;i++){
            int length = Integer.min(strs[0].length(), strs[i].length());
            StringBuilder curr = new StringBuilder();
            for (int j = 0 ; j < length ; j++){
                if (strs[0].charAt(j)!=strs[i].charAt(j)){
                    break;
                }
                curr.append(strs[0].charAt(j));
            }
            if (curr.length()<res.length())
                res= curr.toString();
        }
        return res;
    }
}