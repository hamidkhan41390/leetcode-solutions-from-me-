class Solution {
    public int reverseDegree(String s) {
       ;
        int ans=0;
        int actualvalue=0;
        int i=1;

        for(char c:s.toCharArray()){
            int d=(int)c;
            actualvalue=122-d+1;
            actualvalue=actualvalue*i;
            ans+=actualvalue;
            i++;

        }
        return ans;
    }
}