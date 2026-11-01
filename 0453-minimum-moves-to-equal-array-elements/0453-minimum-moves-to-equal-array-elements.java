class Solution {
    public int minMoves(int[] nums) {
        // TLE for this solution
        // int n = nums.length;
        // if(n == 1) return 0;

        // if(isAllElementEqual(nums)) return 0;

        // int count = 0;
        // while(!isAllElementEqual(nums)){
        //     int largestIndex = findLargestIndex(nums);
        //     //incrementing all elements except for the largest
        //     // for(int i = 0; i < n; i++){
        //     //     if(i != largestIndex){
        //     //         nums[i] += 1;
        //     //     }
        //     // }
            
        //     //instead, decrement the largets by one
        //     nums[largestIndex] -= 1;
        //     count++;
        // }

        // return count;

        int n = nums.length;
        if(n == 1) return 0;

        if(isAllElementEqual(nums)) return 0;

        return (findSum(nums) - (n * findMin(nums)));
    }
    private boolean isAllElementEqual(int[] nums){
        int val = nums[0];
        for(int num : nums){
            if(num != val) return false;
        }
        return true;
    }
    // private int findLargestIndex(int[] nums){
    //     int largest = Integer.MIN_VALUE;
    //     int largestIndex = -1;
    //     for(int i = 0; i < nums.length; i++){
    //         if(nums[i] > largest){
    //             largest = nums[i];
    //             largestIndex = i;
    //         }
    //     }
    //     return largestIndex;
    // }
    private int findSum(int[] nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
    private int findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}