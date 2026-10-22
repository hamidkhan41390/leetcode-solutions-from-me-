class Solution {
    public int subtractProductAndSum(int n) {
         int temp=n;
        int sum=0;
        int mul=1;
        while(temp>0){
            int digit=temp%10;
            sum+=digit;
            mul*=digit;
            temp/=10;
        }
        
       
        return mul-sum;
    }
}