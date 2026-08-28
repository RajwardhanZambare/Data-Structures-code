class Solution {
    public int strStr(String haystack, String needle) {
        boolean found = false;
        int backIndex = 0;

        int i = 0;
        int j = 0;

        while(i < needle.length() && j < haystack.length()){
            if(needle.charAt(i) == haystack.charAt(j)){
                j++;
                i++;
                if(i == needle.length()){
                    found = true;
                }
            }
            else{
                backIndex++;
                j = backIndex;
                i = 0;
            }
        }

        if(found){
            return j - i;
        }

        return -1;
    }
}