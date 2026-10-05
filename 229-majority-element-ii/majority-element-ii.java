class Solution {
    public List<Integer> majorityElement(int[] nums) {
         ArrayList<Integer> l=new ArrayList<>();
         int n=nums.length/3;
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0 )+1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > n) {
                 l.add(i);

            }
        }
        return l;
    }
}