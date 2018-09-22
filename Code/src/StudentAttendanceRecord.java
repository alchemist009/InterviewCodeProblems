public class StudentAttendanceRecord {
    public boolean checkRecord(String s) {

        int aCount = 0, lCount = 0, pCount = 0;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'A') {
                aCount++;
                if (aCount > 1) {
                    return false;
                }
                lCount = 0;
            }
            else if(s.charAt(i) == 'P') {
                lCount = 0;
            }

            else if(s.charAt(i) == 'L'){
                lCount++;
                if(lCount > 2)
                    return false;
            }
        }
        return true;

    }
}


