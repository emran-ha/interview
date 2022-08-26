package problemsolving.apple;

public class Rectangular {
    static void find(char[][] arr, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;
        int start = 0;
        int len = str.length();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++){
                stringBuilder.append(arr[i][j]);
            }
            String t="";
            for (int x = 0; x < stringBuilder.length(); x++) {
                char one = stringBuilder.charAt(x);
                t = t+one;
                if (t.length() >= str.length()) {
                    if (t.equals(str)) {
                        count++;
                    }
                    t = t.substring(1);
                }

            }
            stringBuilder = new StringBuilder();
        }

        stringBuilder = new StringBuilder();

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++){
                stringBuilder.append(arr[j][i]);
            }
            String t="";
            for (int x = 0; x < stringBuilder.length(); x++) {
                char one = stringBuilder.charAt(x);
                t = t+one;
                if (t.length() >= str.length()) {
                    if (t.equals(str)) {
                        count++;
                    }
                    t = t.substring(1);
                }

            }
            stringBuilder = new StringBuilder();
        }

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++){
                if (i == j) {
                    stringBuilder.append(arr[i][j]);
                }
            }
            String t="";
            for (int x = 0; x < stringBuilder.length(); x++) {
                char one = stringBuilder.charAt(x);
                t = t+one;
                if (t.length() >= str.length()) {
                    if (t.equals(str)) {
                        count++;
                    }
                    t = t.substring(1);
                }

            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        char[][] arr = {{'s','o','s','s'},{'s','o','o','s'},{'s','s','s','s'}};
        find(arr, "sos");
    }
}
