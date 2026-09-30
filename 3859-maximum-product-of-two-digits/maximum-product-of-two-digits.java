class Solution {
    public int maxProduct(int n) {
        int[] arr = new int[24];
        int temp = n;
        int i = 0;

        while (temp > 0) {
            int l = temp % 10;
            temp /= 10;
            arr[i++] = l;
        }

        int greater = 0;
        int second = 0;
        int right = 0;

        while (right < i) {

            if (arr[right] > greater) {
                second = greater;
                greater = arr[right];
            }
            else if (arr[right] > second) {
                second = arr[right];
            }

            right++;
        }

        return greater * second;
    }
}