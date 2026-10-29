class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder("");
        solve(result, current, n);
        return result;
    }
    private void solve(List<String> result, StringBuilder current, int n){
        if(current.length() == 2 * n){
            if(isValid(current.toString())){
                result.add(current.toString());
            }
            return;
        }

        current.append("(");
        solve(result, current, n);

        current.deleteCharAt(current.length() - 1);

        current.append(")");
        solve(result, current, n);

        current.deleteCharAt(current.length() - 1);
    }
    private boolean isValid(String current){
        int count = 0;
        for(char ch : current.toCharArray()){
            if(ch == '('){
                count++;
            }
            else{
                count--;
            }
            if(count < 0) return false;
        }
        return count == 0;
    }
}