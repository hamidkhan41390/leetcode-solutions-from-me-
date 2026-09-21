class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int l=0;
        int r=0;
        long currentSum=0;
        long maxSum=0;
        Set<Integer> set=new HashSet<>();
        while(r<nums.length){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                currentSum -= nums[l];
                l++;
            }
            set.add(nums[r]);
            currentSum += nums[r];
            if (r - l + 1 == k) {
                maxSum = Math.max(maxSum, currentSum);
                set.remove(nums[l]);
                currentSum -= nums[l];
                l++;
            }
            r++;
        }
        return maxSum;
    }
}