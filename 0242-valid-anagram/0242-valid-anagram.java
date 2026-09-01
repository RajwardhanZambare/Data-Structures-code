class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                int count = hm.get(s.charAt(i));
                hm.put(s.charAt(i), ++count);
            }
            else{
                hm.put(s.charAt(i), 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            if(hm.containsKey(t.charAt(i))){
                int count = hm.get(t.charAt(i));
                if(count == 0){
                    return false;
                }
                hm.put(t.charAt(i), --count);
            }
            else{
                return false;
            }
        }

        for(Integer value : hm.values()){
            if(value > 0){
                return false;
            }
        }

        return true;
    }
}