class Solution {
    public int maxScore(String s) {
        int oneCount = zeroAndOneCount(s);
        int zeroCount = 0;
        int len = s.length();
        int max = Integer.MIN_VALUE;
        for (int i = 0;i < len-1;i++){
            char ch = s.charAt(i);
            if (ch=='0')
                zeroCount++;
            else
                oneCount--;
            max = Math.max(max,zeroCount+oneCount);
        }
        return max;
    }

    private int zeroAndOneCount(String s) {
        int one = 0;
        for (char ch : s.toCharArray())
            if (ch=='1')
                one++;
        return one;
    }
}