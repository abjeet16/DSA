class Solution {
    public String toHex(int num) {
        if (num==0)
            return "0";
        long temp = num;
        if(num<0){
            temp+=4294967296L;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (temp!=0){
            int rem = (int)(temp%16);
            if (rem>9)
                stringBuilder.append(getHexaCode(rem));
            else
                stringBuilder.append(rem);
            temp/=16;
        }
        return stringBuilder.reverse().toString();
    }

    private char getHexaCode(int i) {
        if (i==10)
            return 'a';
        else if (i==11)
            return 'b';
        else if (i==12)
            return 'c';
        else if (i==13)
            return 'd';
        else if (i==14)
            return 'e';
        else if (i==15)
            return 'f';
        return ' ';
    }
}