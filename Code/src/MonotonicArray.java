public class MonotonicArray {
    public boolean isMonotonic(int[] A) {

        boolean monInc = true;
        boolean monDec = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1] && monInc == true) {
                monInc = false;
            }
        }

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1] && monDec == true) {
                monDec = false;
            }
        }

        return monDec || monInc;

    }


//    class Solution:
//    def isMonotonic(self, A):
//            """
//            :type A: List[int]
//            :rtype: bool
//        """
//    iFlag = True
//            dFlag = True
//
//    B = [i for i in A]
//            B.sort()
//    C = B[::-1]
//
//            # print("A: " + str(A))
//            # print("B: " + str(B))
//            # print("C: " + str(C))
//
//            for i in range(0, len(A)):
//            if A[i] != B[i]:
//    iFlag = False
//        for j in range(0, len(A)):
//            if A[j] != C[j]:
//    dFlag = False
//
//        return iFlag or dFlag

}
