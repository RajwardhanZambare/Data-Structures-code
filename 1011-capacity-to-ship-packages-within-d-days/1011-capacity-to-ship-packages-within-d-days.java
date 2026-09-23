class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = largest(weights);
        int high = sumOfElements(weights);
        while(low <= high){
            int mid = (low + high) / 2;
            int totalDays = findDays(weights, mid);
            if(totalDays <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public int largest(int[] weights){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < weights.length; i++){
            if(weights[i] > max){
                max = weights[i];
            }  
        }
        return max;
    }
    public int sumOfElements(int[] weights){
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
        }
        return sum;
    }
    public int findDays(int[] weights, int cap){
        int load = 0;
        int days = 1;
        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > cap){
                days++;
                load = 0;
                load = weights[i];
            }
            else{
                load = load + weights[i];
            }
        }
        return days;
    }
}