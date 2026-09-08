class Solution {
    public char findTheDifference(String s, String t) {
        char b=0;
        for (char c:s.toCharArray()) {
            b^=c;
        }
        for (char c:t.toCharArray()){
            b^=c;
        }
        return b;
    }
}