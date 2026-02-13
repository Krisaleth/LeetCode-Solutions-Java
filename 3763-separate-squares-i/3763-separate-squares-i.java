class Solution {
    public double separateSquares(int[][] squares) {
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double total = 0;

        for (int[] sq : squares) {
            max = Math.max(max, sq[1] + sq[2]);
            min = Math.min(min, sq[1]);
            total += (double)sq[2] * sq[2];
        }

        double half = total / 2;

        for (int i = 0; i < 100; i++) {
            double mid  = min + (max - min) / 2;
            if (calcBelow(mid, squares) <  half) {
                min = mid;
            }
            else {
                max = mid;
            }
        }

        return min;

    }

    public double calcBelow(double y,int[][] squares) {
        double total = 0;
        for (int[] sq : squares) {
            double yStart = sq[1];
            double side = sq[2];

            double height = Math.max(0, Math.min(side, y - yStart));

            total += height * side;
        }

        return total;
    }
}