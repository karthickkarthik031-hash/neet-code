class Solution {
    public int arrangeCoins(int n) {
        int a=1;
        while(n>=a){
        n=n-a;
        a++;
        }
        return a-1;
    }
}