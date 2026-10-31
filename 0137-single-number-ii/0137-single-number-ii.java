class Solution {
    public int singleNumber(int[] nums) {
        int[] ans = new int[32];
        for(int i = 0; i < 32; i++){
            int sum = 0;
            for(int num : nums){
                num = num >> i;
                sum = sum + (num & 1);
            }
            ans[i] = sum % 3;;
        }
        return toDecimal(ans);
    }
    private int toDecimal(int[] ans){
        int res = 0;
        int power = 1;
        for(int i = 0; i < 32; i++){
            res = res + (ans[i] * power);
            power = power * 2;
        }
        return res;
    }
}