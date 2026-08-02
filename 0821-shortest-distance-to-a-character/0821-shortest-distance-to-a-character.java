class Solution {
    public static int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] leftToRight = new int[len];
        int[] rightToLeft = new int[len];
        getDistanceLeftAndRight(leftToRight,rightToLeft,len,s,c);
        return getResult(leftToRight,rightToLeft,len);
    }

    private static int[] getResult(int[] leftToRight, int[] rightToLeft, int len) {
        int left = 0 , right = len-1;
        while (left<len&&leftToRight[left]!=0){
            left++;
        }
        while (right>=0 && rightToLeft[right]!=0){
            rightToLeft[right]=leftToRight[right];
            right--;
        }
        while (right>=left){
            rightToLeft[right]=Math.min(rightToLeft[right],leftToRight[right]);
            rightToLeft[left]=Math.min(rightToLeft[left],leftToRight[left]);
            right--;
            left++;
        }
        return rightToLeft;
    }

    private static void getDistanceLeftAndRight(int[] leftToRight, int[] rightToLeft, int len,String s,char c) {
        int countLeft = 0 ;
        int countRight = 0 ;
        for (int i = 0 ; i < len ; i++){
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(len-1-i);
            if (leftChar==c){
                countLeft = 0;
            }else {
                countLeft++;
            }
            leftToRight[i]=countLeft;

            if (rightChar==c){
                countRight = 0;
            }else {
                countRight++;
            }
            rightToLeft[len-1-i]=countRight;
        }
    }
}