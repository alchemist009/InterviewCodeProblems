public class ContainerWithMostWater {

    public int maxArea(int[] height) {

//         if(height.length <= 1) {
//             return 0;
//         }
//         int currHeight = height[0];
//         int maxArea = 0;
//         int minHeight = 1000;

//         for(int i = 0; i < height.length; i++) {
//              for(int j = height.length-1; j > i; j--) {
//                  if(i > j)
//                      return maxArea;
//                  minHeight = Math.min(height[i], height[j]);
//                  if(minHeight * (j-i) > maxArea) {
//                       maxArea = minHeight * (j-i);
//                  }
//              }
//         }

        int maxArea = 0;
        int i = 0, j = height.length - 1;

        while (j > i) {
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));

            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }

        return maxArea;
    }
}
