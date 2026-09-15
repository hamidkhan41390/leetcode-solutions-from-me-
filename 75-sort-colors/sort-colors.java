class Solution {
    public void sortColors(int[] nums) {
      bubble(nums);
        
    }
      public void bubble(int []arr){
        boolean swap;
// run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j <= arr.length - i - 1; j++) {
                //swap if the item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //swwap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if (!swap){
                break;
            }
        }

    }
}