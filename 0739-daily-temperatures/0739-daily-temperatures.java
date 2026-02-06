class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int i = 1;
        int length = temperatures.length;
        int[] res = new int[length];
        Stack<Integer> tempStack = new Stack<>();
        tempStack.push(0);
        while (i < length) {
            while(!tempStack.isEmpty() && temperatures[tempStack.peek()] < temperatures[i]) {
                res[tempStack.peek()] = i-tempStack.peek();
                tempStack.pop();
            }
            tempStack.push(i);
            i++;
        }

        return res;
    }
}