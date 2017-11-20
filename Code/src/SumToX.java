/**
 * Finding pairs of elements in an array that sum to a target value
 *
 * @author Gunjan Tomer
 */

import java.util.HashMap;
import java.util.Scanner;

public class SumToX {

    static int howMany(int[] A, int X) { // RT = O(n)

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < A.length; i++){

            if(!map.containsKey(A[i])){
                map.put(A[i], 1);
            }
            else
                map.put(A[i], map.get(A[i]) + 1);

        }

        int howManyCount = 0;
        for(int i = 0; i < A.length; i++){

            int temp = X - A[i];
            if(map.containsKey(temp) && map.get(temp) > 0 && temp != A[i]){
                howManyCount += map.get(temp) * map.get(A[i]);
                map.put(A[i], 0);
            }
        }


        return howManyCount;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int size;
        int X;
        size = scn.nextInt();
        X = scn.nextInt();
        int[] A = new int[size];
        for(int i = 0; i < size; i++){
            A[i] = scn.nextInt();
        }

        System.out.println(howMany(A, X));
    }
}
