class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        int s=1;
        int e=x;
        int mid=-1;
        while(s<=e){
            mid=s+(e-s)/2;
            if((long)mid*mid>(x)){
                e=mid-1;
            }
            else if(mid*mid==x){
                return mid;
            }
            else{
                s=mid+1;
            }
        }
        return e;
    }
}