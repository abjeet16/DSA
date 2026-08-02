class Solution {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE;
        int maxs = Integer.MIN_VALUE;
        for(char ch : s.toCharArray()){
            if(ch>='0'&&ch<='9'){
                int num = ch-'0';
                if(num>max){
                    maxs = max;
                    max=num;
                }else if(num>maxs&&num!=max){
                    maxs = num;
                }
            }
        }
        return maxs==Integer.MIN_VALUE?-1:maxs;
    }
}