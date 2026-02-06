class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < temps.length; i++) {
            while(!tempStack.isEmpty() && temps[tempStack.peek()] < temps[i]) {
                res[tempStack.peek()] = i-tempStack.pop();
            }
            tempStack.push(i);
        }

        return res;
    }
}