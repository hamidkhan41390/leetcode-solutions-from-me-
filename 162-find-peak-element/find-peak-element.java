class Solution {
    public int findPeakElement(int[] nums) {
        int a=0;
        int b=nums.length-2;

        while (a<=b){
            int m=a+(b-a+1)/2;
            if(nums[m]>nums[m+1]){
                b=m-1;
            }
            else if(nums[m]<nums[m+1]){
                a=m+1;
            }
        }
        return a;
    }
}