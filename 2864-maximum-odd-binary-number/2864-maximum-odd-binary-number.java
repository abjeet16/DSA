class Solution {
    public String maximumOddBinaryNumber(String s) {
        int noOfOne = 0;
        for (char ch : s.toCharArray())
            if (ch=='1')
                noOfOne++;
        StringBuilder res = new StringBuilder();
        res.repeat('1',noOfOne-1);
        res.repeat('0',s.length()-noOfOne);
        res.append('1');
        return res.toString();
    }
}