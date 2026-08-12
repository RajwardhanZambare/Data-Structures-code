class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        int count = 0;
        int maxCount = 0;
        for(int i = 0; i < s.length(); i++){
            count = 0;
            for(int j = i; j < s.length(); j++){
                if(hm.containsKey(s.charAt(j))){
                    hm.clear();
                    break;
                }
                else{
                    hm.put(s.charAt(j), 1);
                    count++;
                }
                maxCount = count > maxCount ? count : maxCount;
            }
        }
        return maxCount;
    }
}