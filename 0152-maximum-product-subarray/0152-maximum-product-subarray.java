class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int prefixProd = 1;
        int suffixProd = 1;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(prefixProd == 0){
                prefixProd = 1;
            }
            else if(suffixProd == 0){
                suffixProd = 1;
            }
            prefixProd *= nums[i];
            suffixProd *= nums[n - i - 1];
            max = max > (prefixProd > suffixProd ? prefixProd : suffixProd) ? max : (prefixProd > suffixProd ? prefixProd : suffixProd);
        }

        return max;
    }
}