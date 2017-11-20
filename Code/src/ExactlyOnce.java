/**
 * Finding elements that occur exactly once in an array and storing them in the same order in a new array
 *
 * @author Gunjan Tomer
 *
 */

import java.util.*;

public class ExactlyOnce {

    int position;



    static <T extends Comparable<? super T>> T[] exactlyOnce(T[] A){

        HashMap<T, Integer> map = new HashMap<>();

        for(int i=0; i<A.length; i++){

            if(map.containsKey(A[i]))
                map.remove(A[i]);
            else
                map.put(A[i], i);
        }


        T[] B = (T[]) new Integer[map.size()];

        List<Map.Entry<T, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<T, Integer>>() {
            @Override
            public int compare(Map.Entry<T, Integer> o1, Map.Entry<T, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<Integer, T> sortedMap = new HashMap<>();
        for(Map.Entry<T, Integer> entry : list){
            sortedMap.put(entry.getValue(), entry.getKey());
        }

     //   Iterator it = sortedMap.entrySet().iterator();

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
