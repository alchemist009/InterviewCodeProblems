public class LargestNumberTwiceOfOthers {
    //     public int dominantIndex(int[] nums) {

//         int largest = -1;
//         int lastLargest = -1;
//         int indexOfLargest = -1;

//         for(int i = 0; i < nums.length; i++) {

//             if(nums[i] >= largest){
//                 lastLargest = largest;
//                 largest = nums[i];
//                 indexOfLargest = i;
//             } else if(nums[i] >= lastLargest){
//                 lastLargest = nums[i];
//             }

//         }

//         if(largest >= 2 * lastLargest) {
//             return indexOfLargest;
//         }

//         else{
//             return -1;
//         }

    //     }
    public int dominantIndex(int[] nums) {

        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        for (int j = 0; j < nums.length; j++) {

            if (j != maxIndex && nums[maxIndex] < 2 * nums[j]) {
                return -1;
            }
        }
        return maxIndex;
    }


}
