/**
 * Finding elements that occur exactly once in an array and storing them in the same order in a new array
 *
 * @author Gunjan, Antriksh, Sai Kumar, Swaroop
 *
 */

import java.util.*;

public class ExactlyOnce {

    int position;



    static <T extends Comparable<? super T>> T[] exactlyOnce(T[] A){

        Map<T, Integer> map = new HashMap<>();

        for(int i=0; i<A.length; i++){

            if(map.containsKey(A[i]))
                map.remove(A[i]);
            else
                map.put(A[i], i);
        }


        T[] B = (T[]) new Integer[map.size()];


        Map<Integer, T> sortedMap = new HashMap<>();
        for(Map.Entry<T, Integer> pairs : map.entrySet()){
            sortedMap.put(pairs.getValue(), pairs.getKey());
        }

        int i = 0;

        for(Map.Entry<Integer, T> pairs : sortedMap.entrySet()){

                B[i] = pairs.getValue() ;
                i++;
            }
        return B;

    }


    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        int size = 0;

        size = scn.nextInt();

        Integer[] A = new Integer[size];

        for(int i=0; i< size; i++){

            A[i] = scn.nextInt();
        }

        System.out.println(Arrays.toString(exactlyOnce(A)));
    }
}
