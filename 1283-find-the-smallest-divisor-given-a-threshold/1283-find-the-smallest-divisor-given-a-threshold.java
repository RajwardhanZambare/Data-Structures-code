class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans = Integer.MAX_VALUE;
        int left = 1;
        int right = largest(nums);
        while(left <= right){
            int mid = (left + right) / 2;
            int result = divideArrayElementsByDivisorAndSumTheDivisionResult(nums, mid);
            if(result <= threshold){
                ans = ans < mid ? ans : mid;
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return ans;
    }
    public int largest(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > ans){
                ans = nums[i];
            }
        }
        return ans;
    }
    public int divideArrayElementsByDivisorAndSumTheDivisionResult(int[] nums, int divisor){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + (int) Math.ceil((double) nums[i] / divisor);
        }
        return sum;
    }
}