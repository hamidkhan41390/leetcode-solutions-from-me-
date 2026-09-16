class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of elements in nums1
        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // Store common elements
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : nums2) {

            if (map.containsKey(x) && map.get(x) > 0) {

                list.add(x);

                // Decrease frequency
                map.put(x, map.get(x) - 1);
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}