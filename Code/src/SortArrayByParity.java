public class SortArrayByParity {
//     public int[] sortArrayByParity(int[] A) {

//         int[] res = new int[A.length];
//         int front = 0, end = A.length - 1;
//         for(int i = 0; i < A.length; i++) {
//             if(A[i] % 2 == 0){
//                 res[front] = A[i];
//                 front++;
//             } else {
//                 res[end] = A[i];
//                 end--;
//             }
//         }

//         return res;
//     }

    public int[] sortArrayByParity(int[] A) {

        int curr = 0;
        int next = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                int temp = A[next];
                A[next++] = A[curr];
                A[curr] = temp;
            }
            curr++;

        }

        return A;
    }

}
