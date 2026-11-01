class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] > 5) return false;
        int $5 = 0;
        int $10 = 0;
        int $20 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] - 5 == 0){ //gives 5 dollar bill
                $5++;
                continue;
            }
            else if(bills[i] - 5 == 5){ //gives 10 dollar bill
                if($5 >= 1){
                    $5--;
                    $10++;
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(bills[i] - 5 == 15){ //gives 20 dollar bill
                if(($10 >= 1) && ($5 >= 1)){
                    $10 -= 1;
                    $5 -= 1;
                    $20++;
                    continue;
                }
                else if($5 >= 3){
                    $5 -= 3;
                    $20++;
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}