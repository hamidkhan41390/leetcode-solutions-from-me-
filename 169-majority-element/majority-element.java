class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
                for(int i:nums){
            map.put(i,map.getOrDefault(i,0 )+1);
        }
         int maxFreq = 0;
        int element = 0;

        for (int i : map.keySet()) {
            if (map.get(i) > maxFreq) {
                maxFreq = map.get(i);
                element = i;
            }
        }
        return element;
    }
}