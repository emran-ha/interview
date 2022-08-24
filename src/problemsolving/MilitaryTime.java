package problemsolving;

class MilitaryTime {
    public static String timeConversion(String s) {
        String ap = s.substring(s.length() - 2);
        StringBuilder sb = new StringBuilder(s);
        String hour = s.substring(0, 2);
        sb = new StringBuilder(sb.substring(0, sb.length() - 2));
        if (ap.equals("AM")) {
            if (hour.equals("12")) {
                sb.replace(0, 2, "00");
            }
            return sb.toString();
        }

        int hint = Integer.valueOf(hour);
        System.out.println(hint);
        int res = 12 + hint;
        if (res == 24) {
            sb.replace(0,2, "12");
        } else {
            sb.replace(0, 2, String.valueOf(res));
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(timeConversion("12:40:22PM"));
    }
}
