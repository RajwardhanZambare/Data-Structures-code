class Solution {
    public int maxDepth(String s) {
        if(s.length() == 1) return 0;

        int maxDepth = Integer.MIN_VALUE;
        int currentDepth = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                currentDepth++;
                maxDepth = maxDepth > currentDepth ? maxDepth : currentDepth;
            }
            else if(ch == ')'){
                currentDepth--;
            }
        }

        return maxDepth == Integer.MIN_VALUE ? 0 : maxDepth;
    }
}