class Solution {
    public int addDigits(int num) {
       int ans=addDigit(num);
       return ans;
    }
    public int addDigit(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10; // Reduce num by dropping the last digit
            }
            num = sum; // Reset num to sum for the next pass
        }
        return num;
    }

}