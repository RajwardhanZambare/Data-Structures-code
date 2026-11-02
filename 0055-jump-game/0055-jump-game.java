class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > maxIndex) return false;
            maxIndex = maxIndex > (i + nums[i]) ? maxIndex : (i + nums[i]);
            if(maxIndex >= nums.length - 1) return true; 
        }
        return true;
    }
}