class Solution {
    public int thirdMax(int[] nums) {
        long a=Long.MIN_VALUE;
        long b=Long.MIN_VALUE;
        long c=Long.MIN_VALUE;
        int count=0;
    
        for(int num:nums){
            if(num==a||num==b||num==c){
                continue;
                
            }
            count++;
            if(num>a){
                c=b;
                b=a;
                a=num;
            }else if(num>b){
                c=b;
                b=num;
            }else if(num>c){
                c=num;
            }
        }
        if(count<3){
        return (int)a;
        }
        return (int)c;
    }
}