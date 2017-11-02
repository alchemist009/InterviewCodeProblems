import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromePermutation {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String str = "";
        str = in.nextLine();
        //System.out.println(str);

        char[] charr = str.toLowerCase().toCharArray();

        Map<Character, Integer> m = new HashMap<>();

        for(char c : charr){
            if((m.containsKey(c)) && (c != ' '))
                m.put(c, m.get(c) + 1);
            else
                if(c != ' ')
                    m.put(c, 1);
        }

        int oddCount = 0;
        for(char c : m.keySet()){
            if((m.get(c) % 2 != 0) && (m.get(c) == 1))
                oddCount++;
        }

        if(oddCount > 1)
            System.out.println("Not a palindrome permutation.");
        else
            System.out.println("Palindrome permutation");

        System.out.println(m);

    }
}
