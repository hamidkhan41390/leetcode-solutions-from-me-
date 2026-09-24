class Solution {
    public int[] separateDigits(int[] nums) {
         ArrayList<Integer> l=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i< nums.length;i++){
            int temp=nums[i];
            while(temp!=0){
                int digit=temp%10;
                st.push(digit);
                temp/=10;
            }
            while(!st.isEmpty()) {
                l.add(st.pop());
            }
        }
        int []result=new int[l.size()];
        for(int i=0;i<result.length;i++){
            result[i]=l.get(i);
        }
        return result;
    }
}