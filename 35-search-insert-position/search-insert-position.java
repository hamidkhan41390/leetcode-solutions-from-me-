class Solution {
    public int searchInsert(int[] nums, int target) {
       
        
        int start=0;
        int end=nums.length-1;

        int ans=binarysearch(nums,target,start,end);
    
        return ans;
    }
    static int binarysearch(int[]arr,int target,int start,int end){
       int i;
        while(start<=end) {
            int mid=start +(end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]<target){
                start=mid+1;
            }
            if (arr[mid]>target){
                end=mid-1;
            }
        }
        return start;
}
}