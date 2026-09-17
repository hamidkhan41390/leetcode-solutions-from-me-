class Solution {
    public boolean isValid(String s) {
            Stack<Character> check = new Stack<>();

      
        char[] nums = s.toCharArray();

        if (s.isEmpty()) {
     
            return false;
        }

        for (int i = 0; i < nums.length; i++) {

            // Opening brackets
            if (nums[i] == '{' || nums[i] == '[' || nums[i] == '(') {
                check.push(nums[i]);
            }

            // Closing brackets
            else if (nums[i] == '}' || nums[i] == ']' || nums[i] == ')') {

                if (check.isEmpty()) {
                    
                    return false;
                }

                char top = check.pop();

                if ((nums[i] == '}' && top != '{') ||
                    (nums[i] == ']' && top != '[') ||
                    (nums[i] == ')' && top != '(')) {

                    
                    return false;
                }
            }
        }

        if (check.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}