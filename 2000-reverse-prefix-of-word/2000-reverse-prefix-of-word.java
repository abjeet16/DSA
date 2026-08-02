class Solution {
    public String reversePrefix(String word, char ch) {
        int length=-1;
        for(int i=0;i<word.length();i++){
            if(ch==word.charAt(i)){
                length=i;
                break;
            }
        }
        if(length==-1){
            return word;
        }
        StringBuilder s=new StringBuilder();
        s.append(word.substring(0,length+1)).reverse();
        s.append(word.substring(length+1));
        
        return s.toString();
    }
}