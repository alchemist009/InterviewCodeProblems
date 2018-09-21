public class MaxIncreaseToKeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {

        int n = grid.length;
        int[] maxTop = new int[n];
        int[] maxSide = new int[n];

        int maxIncrease = 0;
        for(int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {

                maxTop[i] = Math.max(maxTop[i], grid[i][j]);
                maxSide[j] = Math.max(maxSide[j], grid[i][j]);
            }
        }

        for(int i=0; i < n; i++) {
            for(int j=0; j < n; j++) {

                maxIncrease += Math.min(maxTop[i], maxSide[j] - grid[i][j]);
            }
        }


        return maxIncrease;
    }

}
