class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(target == nums[mid]) {
                return true;
            }
            //ambiguity check
            if(nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }//left portion is sorted
            else if(nums[left] <= nums[mid]) {

                if(target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }//right portion is sorted
            else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}