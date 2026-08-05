class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        
        prefix[0] = 1;
        suffix[nums.length - 1] = 1;
        
        int p = 1;
        int s = nums.length - 2;
        
        int Pprod = 1;
        int Sprod = 1;
        
        int j = nums.length - 1;
        for(int i = 0; i < nums.length - 1; i++){
            Pprod = Pprod * nums[i];
            prefix[p] = Pprod;
            p++;
            
            Sprod = Sprod * nums[j];
            suffix[s] = Sprod;
            s--;
            j--;
        }
        
        for(int i = 0; i < nums.length; i++){
            nums[i] = prefix[i] * suffix[i];
        }
        
        return nums;
    }
}