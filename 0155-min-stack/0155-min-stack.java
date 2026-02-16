class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int min;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
        this.min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        min = Math.min(min, val);
        minStack.push(min);
        stack.push(val);
    }
    
    public void pop() {
        minStack.pop();
        if (minStack.isEmpty()) {
            min = Integer.MAX_VALUE;
        }
        else {
            min = minStack.peek();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}  
