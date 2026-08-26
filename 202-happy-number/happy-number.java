class Solution {
   
    public boolean isHappy(int n) {

        Set<Integer> a = new HashSet<>();

        while (n != 1) {

            if (a.contains(n)) {
                return false;
            }

            a.add(n);

            n = getSum(n);
        }

        return true;
    }

    public int getSum(int n) {

        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}