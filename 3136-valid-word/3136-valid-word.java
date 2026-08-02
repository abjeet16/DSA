class Solution {
    public boolean isValid(String word) {
        boolean vow = false;
        boolean con = false;
        for(char ch : word.toCharArray()){
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
                if(isVow(ch)){
                    vow = true;
                }else{
                    con = true;
                }
            }else if(!(ch>='0'&&ch<='9')){
                return false;
            }
        }
        return vow&&con&&word.length()>=3;
    }
    private boolean isVow(char ch){
        return switch(ch){
            case 'a','e','i','o','u','A','E','I','O','U' -> true;
            default -> false;
        };
    }
}