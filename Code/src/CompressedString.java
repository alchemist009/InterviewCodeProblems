import java.util.Scanner;

public class CompressedString {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res;
        StringBuilder s = new StringBuilder();
        int countConsecutive = 0;
        for(int i = 0; i < str.length(); i++){
            countConsecutive++;

            if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                s.append(str.charAt(i));
                s.append(countConsecutive);
                countConsecutive = 0;
            }

        }

        res = s.length() < str.length() ? s.toString() : str;

        System.out.println(res);
    }
}
