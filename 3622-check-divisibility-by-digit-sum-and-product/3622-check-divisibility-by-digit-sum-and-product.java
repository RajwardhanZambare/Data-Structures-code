class Solution {
    public boolean checkDivisibility(int n) {
        int sumOfDigits = sum(n);
        int prodOfDigits = prod(n);
        int totalSum = sumOfDigits + prodOfDigits;
        if(n % totalSum == 0){
            return true;
        }
        return false;
    }
    public int sum(int n){
        int num = n;
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
    public int prod(int n){
        int num = n;
        int prod = 1;
        while(num > 0){
            int digit = num % 10;
            prod = prod * digit;
            num = num / 10;
        }
        return prod;
    }
}