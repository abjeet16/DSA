 class Solution {
        public static int strStr(String haystack, String needle) {
            char firstChar = needle.charAt(0);
            for(int i = 0 ; i < haystack.length(); i ++){
                if (haystack.charAt(i)== firstChar && i+needle.length() <= haystack.length()){
                    int count = 0;
                    for (int j = 0 ;j < needle.length();j++){
                        if (needle.charAt(j) != haystack.charAt(i+j)){
                            break;
                        }else {
                            count++;
                        }
                    }
                    if (count==needle.length()){
                        return i;
                    }
                }
            }
            return -1;
        }
    }