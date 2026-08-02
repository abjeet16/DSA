class Solution {
    public boolean checkRecord(String s) {
        boolean absent = s.charAt(0) == 'A';
        int lateCount = s.charAt(0)=='L'?1:0;
        for (int i = 1 ; i <  s.length() ; i++){
            char curr = s.charAt(i);
            if (curr=='A'){
                if (absent)
                    return false;
                absent = true;
            } else if (curr=='L') {
                if (s.charAt(i-1)=='L') {
                    lateCount++;
                    if (lateCount==3)
                        return false;
                }else {
                    lateCount = 1;
                }
            }
        }
        return true;
    }
}