import java.util.Arrays;

class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        StringBuilder res = new StringBuilder();

        if(strs != null && strs.length > 0) {

            Arrays.sort(strs);
            char[] a = strs[0].toCharArray();
            char[] b = strs[strs.length-1].toCharArray();


            for(int i = 0; i < a.length; i++) {
                if(b.length > i && a[i] == b[i]) {
                    res.append(a[i]);
                }
                else
                    return res.toString();
            }
        }

        return res.toString();
    }
}