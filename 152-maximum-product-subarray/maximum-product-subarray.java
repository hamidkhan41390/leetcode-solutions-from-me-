class Solution {
    public int maxProduct(int[] nums) {
        int mxsum=nums[0];
        int currentmin=nums[0];
        int p=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            int temp=mxsum;
            mxsum=Math.max(nums[i],Math.max(temp*nums[i],currentmin*nums[i]));
            currentmin=Math.min(nums[i],Math.min(temp*nums[i],currentmin*nums[i]));
            p=Math.max(p,mxsum);
        }
        return p;
    }
}