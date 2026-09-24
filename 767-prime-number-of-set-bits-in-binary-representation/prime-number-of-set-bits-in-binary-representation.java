class Solution {
    public int countPrimeSetBits(int left, int right) {
         int ifcountisprime=0;
        for (int i=left;i<=right;i++) {
            int ans = countSetBits(i);
            boolean isPrime = true;

            // 1. Numbers less than or equal to 1 are not prime
            if (ans <= 1) {
                isPrime = false;
            } else {
                // 2. Check for factors from 2 up to number - 1
                for (int j = 2; j < ans; j++) {
                    if (ans % j == 0) {
                        isPrime = false; // Found a factor, so it's not prime
                        break;           // Stop checking further
                    }
                }
            }

            // 3. Print the result
            if (isPrime) {
               ifcountisprime++;
            }
        }
        return ifcountisprime;
    }
    
     public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n-1); // Clears the rightmost '1' bit
            count++;
        }
        return count;
    }
}