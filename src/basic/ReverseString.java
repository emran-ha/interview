package basic;

class ReverseString {

    static void splitter(String st){
        int n = 0;
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == ' '){
                n++;
            }
        }
    }
}
