class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) return 0;
        if(divisor == 1) return dividend;
        if(divisor == -1) {
            if(dividend == Integer.MIN_VALUE) return Integer.MAX_VALUE;
            return -dividend;
        }
        if(dividend == divisor) return 1;

        long num1 = dividend < 0 ? -(long)dividend : dividend;
        long num2 = divisor < 0 ? -(long)divisor : divisor;
        long ans = 0;
        while(num1 >= num2){
            num1 = num1 - num2;
            ans++;
        }

        if(dividend < 0 && divisor < 0) return (int)ans;
        else if(dividend < 0 || divisor < 0) return -(int)ans;

        return (int)ans;
    }
}