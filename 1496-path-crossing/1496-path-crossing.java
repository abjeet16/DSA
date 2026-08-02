class Solution {
    public static boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x = 0 , y = 0 ;
        set.add(x+","+y);
        for (char ch : path.toCharArray()){
            if (ch=='N')
                x++;
            else if (ch=='S')
                x--;
            else if (ch=='E')
                y++;
            else
                y--;
            if (!set.add(x+","+y))
                return true;
        }
        return false;
    }
}