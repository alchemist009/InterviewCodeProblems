import java.util.*;

class DateFormat {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the date: ");
        String date = scn.nextLine();

        char[] dateArr = date.toCharArray();


        String answer = changeDateFormat(date);

        System.out.println(answer);

    }

    private static String changeDateFormat(String date) {

        if(date.contains("/")){
            String[] dateSplit = date.split("/");
            if(dateSplit[0].length() == 4) {
                String answer = dateSplit[0];
                answer +=dateSplit[1];
                answer +=dateSplit[2];
                return answer;


            }
            else
            if(dateSplit[2].length() == 4) {
                String answer = dateSplit[2];
                answer += dateSplit[1];
                answer += dateSplit[0];
                return answer;
            }
        }

        else {
            if(date.contains("-")) {
                String[] dateSplit = date.split("-");
                if(dateSplit[2].length() == 4) {
                    String answer = dateSplit[2];
                    answer += dateSplit[0];
                    answer += dateSplit[1];
                    return answer;
                }

                else{
                    String answer = "Not a valid date.";
                    return answer;
                }
            }
        }
        return "-1";
    }
}