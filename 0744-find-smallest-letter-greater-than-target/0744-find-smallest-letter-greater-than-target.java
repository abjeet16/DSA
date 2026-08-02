class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0 , right = letters.length-1;
        int res = Integer.MAX_VALUE;
        while (left<=right){
            int mid = (left+right)/2;
            if(letters[mid]>target){
                res=mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        if (res==Integer.MAX_VALUE)
            return letters[0];
        return letters[res];
    }
}