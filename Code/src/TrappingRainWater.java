public class TrappingRainWater {

    public int trap(int[] height) {
        int trapped = 0;
        int a = 0, b = height.length - 1, leftHigh = 0, rightHigh = 0;

        while(a <= b) {
            leftHigh = Math.max(leftHigh, height[a]);
            rightHigh = Math.max(rightHigh, height[b]);

            if(leftHigh < rightHigh) {
                trapped += (leftHigh - height[a]);
                a++;
            }
            else {
                trapped += (rightHigh - height[b]);
                b--;
            }
        }

        return trapped;
    }
}
