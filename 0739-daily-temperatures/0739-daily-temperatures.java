class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int length = temperatures.length;
        int[] res = new int[length];
        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(0);
        for (int i = 1; i < length; i++) {
            while(!tempStack.isEmpty() && temperatures[tempStack.peek()] < temperatures[i]) {
                res[tempStack.peek()] = i-tempStack.peek();
                tempStack.pop();
            }
            tempStack.push(i);
        }

        return res;
    }
}