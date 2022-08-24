package problemsolving;

class ReverseString {

    static void reverse(String s){
        StringBuilder rev = new StringBuilder(s);
        rev.reverse();
        System.out.println(rev);
    }
    static void reverseManual(String s){
        char[] chars = s.toCharArray();
        String rev = "";
        for(int i = chars.length - 1; i >= 0; i--){
            rev = rev + chars[i];
        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
        reverse("Emran hasaney");
        reverseManual("Emran hasaney");
    }
}
