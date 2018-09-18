import java.util.*;

public class FindOccurrences {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int sample = scn.nextInt();
        int toFind = scn.nextInt();

        System.out.println(findOccurrences(sample, toFind));
    }

    private static int findOccurrences(int sample, int toFind) {

        String number = String.valueOf(sample);
        char[] num = number.toCharArray();

        int count = 0;

        char val = (char) ('0' + toFind);

        for(char ch : num) {
            if(ch == val)
                count++;
        }

        return count;
    }
}
