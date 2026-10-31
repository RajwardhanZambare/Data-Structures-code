class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums){
            int val = hm.get(num) == null ? 0 : hm.get(num);
            hm.put(num, ++val);
        }
        int i = 0;
        int[] ans = new int[2];
        for(int num : hm.keySet()){
            if(hm.get(num) == 1){
                ans[i] = num;
                i++;
            }
            if(i == 2) break;
        }
        return ans;
    }
}