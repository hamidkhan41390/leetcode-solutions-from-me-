class Solution {
    public int arrangeCoins(int n) {
        int ans=0;
        for(int i=1;i<=n;i++){
            if(n>=i){
                n=n-i;
            }
            else{
                break;
            }
            ans=i;
        }
        return ans;
    }
}