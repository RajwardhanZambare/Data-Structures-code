class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;

        int sum = nums[0];
        while(right < nums.length){
            if(sum >= target){
                minLength = minLength < right - left + 1 ? minLength : right - left + 1;
                sum = sum - nums[left];
                left++;
            }
            else{
                right++;
                if(right < nums.length){
                    sum = sum + nums[right];
                }
            }
        }

        minLength = minLength == Integer.MAX_VALUE ? 0: minLength;

        return minLength;
    }
}