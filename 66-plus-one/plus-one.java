class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag=false;
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0;
            }
            else{
                flag=true;
                digits[i]+=1;
                break;
            }
        }
        if(!flag){
            int bigger[]=new int[digits.length+1];
            System.arraycopy(digits,0,bigger,1,digits.length);
            bigger[0]=1;
            digits=bigger;
        }
        return digits;
    }
}