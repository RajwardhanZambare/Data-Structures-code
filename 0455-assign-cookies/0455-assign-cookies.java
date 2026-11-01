class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int greedIndex = 0;
        int sizeIndex = 0;
        while(greedIndex < g.length && sizeIndex < s.length){
            if(g[greedIndex] <= s[sizeIndex]){
                greedIndex++;
                sizeIndex++;
                continue;
            }
            sizeIndex++;
        }
        return greedIndex;
    }
}