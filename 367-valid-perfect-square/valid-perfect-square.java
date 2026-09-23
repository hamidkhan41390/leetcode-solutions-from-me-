class Solution {
    public boolean isPerfectSquare(int num) {
      int c=num/2;
      if(num==1){
        return true;
      }
      for(int i=0;i<=c;i++){
            if(i*i==num){
                return true;
            }
      }
      return false;
    }
}