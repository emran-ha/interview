package problemsolving.infotech;

class CharacterCounter {
    static String count(String s) {
        int index = 0;
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while(index < s.length()) {
            char c = s.charAt(index);
            while (index < s.length() && c == s.charAt(index)) {
                count++;
                index++;
            }
            stringBuilder.append(c);
            stringBuilder.append(count);
            count = 0;
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(count("aabcccd"));
    }
}
