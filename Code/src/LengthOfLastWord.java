public class LengthOfLastWord {

    //Method 1
    //     public int lengthOfLastWord(String s) {

//         if(s.split(" ").length < 1) {
//             return 0;
//         }
//         String[] strArray = s.split(" ");

//         if(strArray.length > 0) {
//             return strArray[strArray.length - 1].length();
//         }
//         else
//             return 0;
//     }

    //Method 2
//     public int lengthOfLastWord(String s) {

//         if(s.length() < 1 || s.equals(null)) {
//             return 0;
//         }

//         int count = 0;
//         for(int i = s.length() - 1; i >= 0; i--) {
//             if(s.charAt(i) != ' ') {
//                 count++;
//             }
//             else
//                 return count;
//         }

//         return count;
//     }


    // Method 3
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(' ') + 1;
        return s.length() - lastIndex;
    }
}
