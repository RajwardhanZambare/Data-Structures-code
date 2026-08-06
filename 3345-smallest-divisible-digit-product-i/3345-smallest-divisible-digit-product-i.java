class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        int number;
        
        int prod = 1;
        
        for(int i=n; i<=100; i++){
            number = i;
            prod = 1;
            while(number != 0){
                int digit = number % 10;
                prod *= digit;
                number /= 10;
            }
            if(prod % t == 0){
                ans = i;
                break;
            }
        }
        
        return ans;
    }
}