class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        if(nums.length == 2){
            return nums[0] > nums[1] ? 0 : 1;
        }
        if(nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length - 1;
        }
        if(nums[0] > nums[1]){
            return 0;
        }
        int left = 1;
        int right = nums.length - 2;
        int ans = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                ans = mid;
                break;
            }
            else if(nums[mid - 1] > nums[mid + 1]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
}