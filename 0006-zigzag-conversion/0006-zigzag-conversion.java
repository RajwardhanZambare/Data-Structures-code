class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1){
            return s;
        }

        String[] str = new String[numRows];
        for(int i = 0; i < numRows; i++){
            str[i] = "";
        }

        boolean goReverse = false;
        int idx = 0;
        for(int i = 0; i < s.length(); i++){
            if(goReverse){
                str[idx] += s.charAt(i);
                if(idx == 0){
                //    str[idx] += "-1";
                   goReverse = !goReverse;
                   idx++; 
                   continue;
                }
                idx--;
            }
            else{
                str[idx] += s.charAt(i);
                if(idx == numRows - 1){
                    // str[idx] += "-1";
                    goReverse = !goReverse;
                    idx--;
                    continue;
                }
                idx++;
            }
        }

        String answer = "";
        for(int i = 0; i < str.length; i++){
            answer += str[i];
        }

        return answer;
    }
}