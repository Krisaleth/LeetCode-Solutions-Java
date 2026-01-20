class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> check = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                check.push(s.charAt(i));
            }
            else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (check.empty()) {
                    return false;
                }
                else {
                    if (s.charAt(i) == ')' && check.peek() == '(' ||
                    s.charAt(i) == ']' && check.peek() == '[' ||
                    s.charAt(i) == '}' && check.peek() == '{') { 
                        check.pop();
                    }
                    else {
                        return false;
                    }
                }
            }
        }
        return check.empty();
    }
}