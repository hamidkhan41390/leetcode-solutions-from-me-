class Solution {
    public void moveZeroes(int[] nums) {
       int insertpos=0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i]!=0){
                nums[insertpos]=nums[i];
                insertpos++;
            }
        }
        for (int i = insertpos; i < nums.length ; i++) {
            nums[i]=0;
        }

        }
    }
