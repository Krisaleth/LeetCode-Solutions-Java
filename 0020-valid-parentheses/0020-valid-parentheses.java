class Solution {
    public boolean isValid(String s) {
        Stack<Character> stackS = new Stack<>();

        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stackS.push(c);
            } else {
                if (stackS.isEmpty()) return false;
                char top = stackS.peek();
                if ((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')) {
                        stackS.pop();
                    }
                    else {
                        return false;
                    }
            }
            
        }
        
        return stackS.isEmpty();
    }
}