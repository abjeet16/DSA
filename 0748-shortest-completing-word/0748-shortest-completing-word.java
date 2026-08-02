class Solution {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        int[] lpCount = new int[26];
        licensePlate = licensePlate.toUpperCase();
        int highestMatch = Integer.MIN_VALUE;
        String res = "";
        for (char ch : licensePlate.toCharArray())
            if (65<=ch && ch<=90)
                lpCount[ch-'A']++;
        for (String str : words){
            int[] currCount = new int[26];
            String tempStr = str.toUpperCase();
            int currMatch = 0;
            for (char ch : tempStr.toCharArray()){
                int index = ch-'A';
                if (65<=ch && ch<=90)
                    currCount[index]++;
                if (currCount[index]<=lpCount[index])
                    currMatch++;
            }
            if (currMatch>highestMatch){
                highestMatch = currMatch;
                res = str;
            } else if (currMatch==highestMatch&&str.length()<res.length()) {
                res = str;
            }
        }
        return res;
    }
}