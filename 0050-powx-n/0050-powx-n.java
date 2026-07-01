class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        if(x == 1 || n == 0){
            return 1;
        }
        else if(x == -1){
            if(n % 2 == 0){
                return 1;
            }
            else{
                return -1;
            }
        }
        else if(x == 0 || n > 2147483647 || n < -2147483647){
            return 0;
        }
        if(n % 2 == 0){
            int i = n < 0 ? n * -1 : n;
            while(i > 0){
                result = result * x;
                i--;
            }
            if(n < 0){
                return 1.0/result;
            }
            else{
                return result;
            }
        }
        else{
            int i = n < 0 ? n * -1 : n;
            while(i > 0){
                result = result * x;
                i--;
            }
            if(x < 0 && n < 0){
                return (1.0/result);
            }
            else if(x < 0 && n > 0){
                return result;
            }
            else if(x > 0 && n < 0){
                return 1.0/result;
            }
        }
        return result;
    }
}