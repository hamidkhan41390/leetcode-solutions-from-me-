class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int c=0;
        int d=s.length()-1;
        while(c<d){
        if(s.charAt(c)!=s.charAt(d)){
            return false;
        }
            c++;
            d--;
        }
        return true;
        }
    }
