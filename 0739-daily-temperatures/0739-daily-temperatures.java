class Solution {
    public int[] dailyTemperatures(int[] temps) {
        int[] res = new int[temps.length];
        int[] stack = new int[temps.length];
        int top = -1;
        for (int i = 0; i < temps.length; i++) {
            while(top >= 0 && temps[stack[top]] < temps[i]) {
                int prevIndex = stack[top--];
                res[prevIndex] = i - prevIndex;
            }
            stack[++top] = i;
        }

        return res;
    }
}