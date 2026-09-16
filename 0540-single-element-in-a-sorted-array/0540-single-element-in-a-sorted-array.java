class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }
        int left = 1;
        int right = nums.length - 2;
        int ans = 0;
        while(left <= right){
            int mid = (left + right) / 2;
            //check if the mid element is the single element
            if(nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]){
                ans = nums[mid];
                break;
            }
            else if(mid % 2 != 0){ //standing on odd index
                if(nums[mid] == nums[mid + 1]){ // right element is same as of mid element
                    right = mid - 1; //eliminate right half
                }
                else{ // left element is same as that of mid element
                    left = mid + 1; //eliminate left half
                }
            }
            else{ //standing on even index
                if(nums[mid] == nums[mid + 1]){ //right element is same as of mid element
                    left = mid + 1; //eliminate left half
                }
                else{ //left element is same as of mid element
                    right = mid - 1; //eliminate right half
                }
            }
        }
        return ans;
    }
}