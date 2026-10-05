class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int ans=0;
        for(int c:nums){
            if(set.contains(c)){
                ans= c;
            }
            set.add(c);
        }
        return ans;
    }
}