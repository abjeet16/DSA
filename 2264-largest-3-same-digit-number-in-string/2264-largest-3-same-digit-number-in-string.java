class Solution {
    public static String largestGoodInteger(String num) {
        String max = "";
        int len = num.length();
        for (int i = 0 ; i < len-2 ; i++){
            String curr = num.substring(i,i+3);
            if (valid(curr))
                max = compair(max,curr);
        }
        return max;
    }

    private static String compair(String max, String curr) {
        if (max.isEmpty())
            return curr;
        return Integer.parseInt(max)>Integer.parseInt(curr)?max:curr;
    }

    private static boolean valid(String num) {
        return num.charAt(0)==num.charAt(1)&&num.charAt(0)==num.charAt(2);
    }
}