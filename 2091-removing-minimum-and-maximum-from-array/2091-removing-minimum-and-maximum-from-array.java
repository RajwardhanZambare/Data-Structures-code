class Solution {
    public int minimumDeletions(int[] nums) {

        if(nums.length == 1){
            return 1;
        }
        if(nums.length == 2){
            return 2;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], i);
            max = nums[i] > max ? nums[i] : max;
            min = nums[i] < min ? nums[i] : min;
        }

        int minIndex = hm.get(min);
        int maxIndex = hm.get(max);

        int left = Math.max(minIndex, maxIndex) + 1;
        int right = nums.length - Math.min(minIndex, maxIndex);
        
        int leftRight = (minIndex + 1) + (nums.length - maxIndex);
        int rightLeft = (maxIndex + 1) + (nums.length - minIndex);

        return Math.min(
            Math.min(left, right),
            Math.min(leftRight, rightLeft)
        );
    }
}