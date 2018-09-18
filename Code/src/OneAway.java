import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OneAway {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        boolean replaceFlag = false;
        boolean insertFlag = false;
        boolean deleteFlag  = false;

        if(s1.length() == s2.length()) {
            replaceFlag = oneEditReplace(s1,s2);
        }
        else
            if(s1.length() < s2.length()) {
            insertFlag = oneEditInsert(s1,s2);
            }

            else{
                deleteFlag = oneEditInsert(s2, s1);
            }

        if(replaceFlag || insertFlag || deleteFlag)
            System.out.println("One edit away.");
        else
            System.out.println("Not one edit away.");


    }

    private static boolean oneEditReplace(String s1, String s2){

        boolean different = false;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)) {

                if(different)
                    return false;
                different = true;
            }

        }
        return true;
    }

    private static boolean oneEditInsert(String s1, String s2) {

        int index1 = 0, index2 = 0;
        while(index1 < s1.length() && index2 < s2.length()){
            if(s1.charAt(index1) != s2.charAt(index2)) {
                if (index1 != index2)
                    return false;
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }
}
