public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {

        int[][] res = new int[n][n];
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        int count = 1;
        while (left <= right) {

            for (int j = left; j <= right; j++) {
                res[top][j] = count++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = count++;
            }
            right--;

            for (int j = right; j >= left; j--) {
                res[bottom][j] = count++;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res[i][left] = count++;
            }
            left++;
        }

        return res;
    }
}
