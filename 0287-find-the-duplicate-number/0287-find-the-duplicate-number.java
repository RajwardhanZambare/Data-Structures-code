class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int ans = 0;
        for(int num : nums){
            if(hm.containsKey(num)){
                ans = num;
                break;
            }
            else{
                hm.put(num, 1);
            }
        }

        return ans;
    }
}