class Solution {
    public static boolean isSelfDiv(int i) {
        int temp = i;
        int dig = 0;
        while (temp > 0) {
            dig = temp % 10;
            if(dig==0)
            {
                return false;
            }
            if (i % dig != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        
    List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
        {
            if(isSelfDiv(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}