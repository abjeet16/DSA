class Solution {
    public int countCollisions(String directions) {
        int count = 0;
        int j = directions.length()-1;
        int i = 0;
        while (i<=j){
            if (directions.charAt(i)=='L')
                i++;
            else if (directions.charAt(j)=='R')
                j--;
            else
                break;
        }
        while (i<=j){
            if (directions.charAt(i)!='S')
                count++;
            i++;
        }
        return count;
    }
}