class Solution {
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        while (num1<=num2){
            String str = String.valueOf(num1);
            int res = 0;
            for (int i = 1 ; i < str.length()-1 ; i++){
                int leftNum = str.charAt(i-1)-'0';
                int rightNum = str.charAt(i+1)-'0';
                int curr = str.charAt(i)-'0';
                if (curr>leftNum&&curr>rightNum)
                    res++;
                else if (curr<leftNum&&curr<rightNum)
                    res++;
            }
            result+=res;
            num1++;
        }
        return result;
    }
}