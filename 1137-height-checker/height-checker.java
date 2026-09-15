class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int []copy=heights.clone();
        insertion(copy);
        for(int i=0;i<heights.length;i++){
            if(copy[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
     public void swap(int []arr,int first ,int second ){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public void  insertion(int []arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    
                }else {
                    break;
                }
            }
        }


    }
}