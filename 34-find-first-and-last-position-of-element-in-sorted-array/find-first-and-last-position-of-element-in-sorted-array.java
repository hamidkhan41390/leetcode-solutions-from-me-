class Solution {
    public int[] searchRange(int[] nums, int target) {
         int start = 0;
        int end = nums.length - 1;

        int first = -1;
        int last = -1;

// Find first occurrence
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
                end = mid - 1;       // search left
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

// Reset start and end
        start = 0;
        end = nums.length - 1;

// Find last occurrence
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1;     // search right
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
return new int[]{first,last};
    }
}