class Solution {
    public int countOdds(int low, int high) {
        int a=(high-low+1);
        if((low%2==0)&&(high%2==0)||(low%2==0)&&(high%2!=0)||(low%2!=0)&&(high%2==0)){
            return a/2;
        }
        return a/2+1;
    }
}