class Solution {
    public int maxProduct(int[] nums) {
          int max1 = 0;
        int max2 = 0;

        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Purana sabse bada ab dusra sabse bada ban gaya
                max1 = num;  // Naya sabse bada mil gaya
            } else if (num > max2) {
                max2 = num;  // Agar max1 se chota hai par max2 se bada hai
            }
        }
        return (max1 - 1) * (max2 - 1);
    }
}
