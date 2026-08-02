class Solution {
    public static int calPoints(String[] operations) {
        int score = 0;
        int len = operations.length;
        int[] resArr = new int[len];
        int idx = 0;
        for (String operation : operations) {
            char ch = operation.charAt(0);
            if (ch=='C') {
                score-=resArr[idx-1];
                idx -= 2;
            } else if (ch == '+') {
                resArr[idx] = resArr[idx - 1] + resArr[idx - 2];
                score += resArr[idx];
            } else if (ch == 'D') {
                resArr[idx] = resArr[idx - 1] * 2;
                score += resArr[idx];
            } else {
                resArr[idx] = Integer.parseInt(operation);
                score += resArr[idx];
            }
            idx++;
        }
        return score;
    }
}