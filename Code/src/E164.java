/**
 *
 * Program to convert a given string into the E164 format for US numbers.
 *
 */

import java.util.Scanner;


public class E164 {

    /**
     * Method to validate the provided string to comply with the characters allowed in phone numbers
     *
     * @param s
     * @return bigFlag
     */
    private boolean checkValid(String s) {

        char[] ch = s.toCharArray();

        boolean valFlag;
        boolean bigFlag = true;

        for(char c : ch) {
            //valFlag = false;
            if(!(Character.isDigit(c)  || (c == '+') || (c == '(') || (c == ')') || (c == '-')))
                valFlag = false;
            else
                valFlag = true;
            bigFlag = valFlag && bigFlag;
        }
        return bigFlag;
    }

    /**
     * Method to convert the input string to a valid E164 format number with the US CC
     *
     * @param number
     * @return string
     */
    private String makeNumber(String number) {
        StringBuilder sb = new StringBuilder();
        sb.append("+1 ");

        char[] num = number.toCharArray();

        for(char n : num) {

            if(n == '(' || n == ')'||  n=='-') {
            }
            else
                if(Character.isDigit(n)){
                    sb.append(n);
                }
            if(sb.length() > 13){
                System.out.println("Length exceeded for 10 digit phone number.");
                return null;
            }
        }

        return sb.toString();
    }

    /**
     * Main method for E164 class
     *
     * @param args
     */

    public static void main(String[] args) {

        E164 obj = new E164();

        Scanner scn = new Scanner(System.in);

        String num = scn.nextLine();

        if(obj.checkValid(num)){

            num = obj.makeNumber(num);

            System.out.println(num);
        }

        else
            System.out.println("Invalid entry");

    }
}
