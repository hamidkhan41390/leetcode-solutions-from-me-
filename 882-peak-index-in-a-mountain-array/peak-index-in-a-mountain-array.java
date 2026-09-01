class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int a=0;
        int b=arr.length-1;

        while (a<=b){
            int m=a+(b-a)/2;
            if(arr[m]>arr[m+1]){
                b=m-1;
            }
            else if(arr[m]<arr[m+1]){
                a=m+1;
            }
        }
        return a;
    }
}