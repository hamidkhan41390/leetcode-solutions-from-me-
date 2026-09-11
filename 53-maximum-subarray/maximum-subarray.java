class Solution {
    public int maxSubArray(int[] nums) {
        int mxsum=nums[0];
        int current=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            current=Math.max(current+nums[i],nums[i]);
            mxsum=Math.max(current,mxsum);
        }
        return mxsum;
    }
}