class Solution {
    public int maxProduct(int[] nums) {
                for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (nums[j]< nums[j-1]){
                    swap(nums,j,j-1);
                }else {
                    break;
                }
            }
        }
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

        }
       public void swap(int [] nums, int first , int second ){
        int temp=nums[first];
        nums[first]= nums[second];
        nums[second]=temp;
    }
}
