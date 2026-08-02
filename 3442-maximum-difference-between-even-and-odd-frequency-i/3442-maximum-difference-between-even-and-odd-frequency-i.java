class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray())
            freq[ch-'a']++;
        int oddMin = Integer.MAX_VALUE;
        int evenMin = Integer.MAX_VALUE;
        int oddMax = Integer.MIN_VALUE;
        int evenMax = Integer.MIN_VALUE;
        for(int i : freq){
            if(i!=0){
                if(i%2==0){
                    evenMin = Math.min(evenMin,i);
                    evenMax = Math.max(evenMax,i);
                }else{
                    oddMin = Math.min(oddMin,i);
                    oddMax = Math.max(oddMax,i);
                }
            }
        }
        return Math.max(oddMin-evenMax,oddMax-evenMin);
    }
}