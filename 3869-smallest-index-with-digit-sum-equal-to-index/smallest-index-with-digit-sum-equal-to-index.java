class Solution {
    public int smallestIndex(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
            if(i==digsum(nums[i])){
                return i;
            }
            
        }
        return -1;
    }
    public static int digsum(int n){
        int sum=0;
        int temp=n;
        while (temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }
        return sum;
    }
}