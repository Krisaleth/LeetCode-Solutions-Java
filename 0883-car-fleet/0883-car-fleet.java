class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] car = new int[position.length][2];

        for (int i = 0; i < car.length; i++) {
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car, (car1, car2) -> Integer.compare(car2[0], car1[0]));

        Stack<Double> stack = new Stack<>();
        
        for (int i = 0; i < car.length; i++) {
            if (stack.isEmpty() || ((double)  (target - car[i][0]) / car[i][1]) > stack.peek()) {
                stack.push((double) (target - car[i][0]) / car[i][1]);
            }
        }

        return stack.size();   
    }
}
