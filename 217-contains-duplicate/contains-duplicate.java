class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of elements in nums1
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
       Object[] values = map.values().toArray();

for (int i = 0; i < values.length; i++) {
     if ((Integer) values[i] > 1){
        return true;
     }
}
return false;
    }
}